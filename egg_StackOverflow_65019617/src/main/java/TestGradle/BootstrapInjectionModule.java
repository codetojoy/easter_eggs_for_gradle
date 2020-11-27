package TestGradle;

import com.netflix.governator.annotations.Modules;

import netflix.adminresources.resources.KaryonWebAdminModule;
import netflix.karyon.KaryonBootstrap;
import netflix.karyon.ShutdownModule;
import netflix.karyon.archaius.ArchaiusBootstrap;
import netflix.karyon.jersey.blocking.KaryonJerseyModule;

@ArchaiusBootstrap
@KaryonBootstrap(name = "pingpong-service")
@Modules(include = {
        ShutdownModule.class,
        KaryonWebAdminModule.class,
        BootstrapInjectionModule.KaryonJerseyModuleImpl.class
})
public class BootstrapInjectionModule {
    
    class KaryonJerseyModuleImpl extends KaryonJerseyModule{

        @Override
        protected void configureServer() {
            server().port(8888).threadPoolSize(100);
        }
        
    }

}
