package ru.rv.system;

import com.google.common.collect.Sets;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;
import ru.rv.system.resources.AuditSystemResourceImpl;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

import static ru.rv.system.Constants.*;

@ApplicationPath(JAX_RS_APPLICATION_ROOT_PATH)
public class AuditSystemApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        return Sets.<Class<?>>newHashSet(AuditSystemResourceImpl.class, JacksonFeature.class, RolesAllowedDynamicFeature.class);
    }
}
