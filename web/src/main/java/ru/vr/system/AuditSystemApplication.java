package ru.vr.system;

import com.google.common.collect.Sets;
import org.glassfish.jersey.jackson.JacksonFeature;
import ru.vr.system.resources.AuditSystemResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/rest")
public class AuditSystemApplication extends Application
{
    @Override
    public Set<Class<?>> getClasses()
    {
        return Sets.<Class<?>>newHashSet(AuditSystemResource.class, JacksonFeature.class);
    }
}
