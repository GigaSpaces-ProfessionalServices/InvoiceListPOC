package com.gigaspaces.gigapro.plugin;

import com.google.gson.Gson;
import com.j_spaces.core.client.SQLQuery;
import org.openspaces.admin.Admin;
import org.openspaces.admin.gsa.GridServiceAgent;
import org.openspaces.admin.gsc.GridServiceContainer;
import org.openspaces.admin.pu.ProcessingUnitInstance;
import org.openspaces.admin.rest.CustomManagerResource;
import org.openspaces.admin.rest.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import java.util.concurrent.TimeUnit;

/**
 * @author Denys_Novikov
 * Date: 22.02.2018
 */
@CustomManagerResource
@Path("/controller")
public class Plugin {

    private static final int TIMEOUT = 10000; // 10 sec
    private static Logger logger = LoggerFactory.getLogger(Plugin.class);

    @Context
    Admin admin;

    @GET
    @Path("/getAcctSumTs")
    public Response start(@QueryParam("appName") String appName, @QueryParam("typeName") String typeName) {
        try {
            ProcessingUnitInstance instance = findRebalancerInstance(admin, appName);
            if (instance == null) {
                return Response.status(404).entity("Space not found").build();
            }

            Object[] result = instance.getSpaceInstance().getGigaSpace().readMultiple(new SQLQuery<>(typeName, ""));

            String jsonStr = new Gson().toJson(result);
            logger.info("Got result: " + result.length);
            return Response.ok().entity("Invocation successfull->" + jsonStr).build();

        } catch (Throwable e) {
            return Response.status(500).entity("Error: " + e.getMessage()).build();
        }
    }

    private static ProcessingUnitInstance findRebalancerInstance(Admin admin, String appName) {
        admin.getGridServiceAgents().waitForAtLeastOne(10, TimeUnit.SECONDS);
        for (GridServiceAgent agent : admin.getGridServiceAgents().getAgents()) {
            for (GridServiceContainer container : agent.getMachine().getGridServiceContainers().getContainers()) {
                for (ProcessingUnitInstance instance : container.getProcessingUnitInstances()) {
                    if (appName.equals(instance.getProcessingUnit().getName())) {
                        return instance;
                    }
                }
            }
        }
        return null;
    }


}
