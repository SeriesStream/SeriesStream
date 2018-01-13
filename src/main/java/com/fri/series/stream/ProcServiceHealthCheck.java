package com.fri.series.stream;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@Health
@ApplicationScoped
public class ProcServiceHealthCheck implements HealthCheck {

    @Inject
    ProcResource procResource;

    @Override
    public HealthCheckResponse call() {

        if (procResource.getHealthy()) {
            return HealthCheckResponse.named(ProcServiceHealthCheck.class.getSimpleName()).up().build();
        } else {
            return HealthCheckResponse.named(ProcServiceHealthCheck.class.getSimpleName()).down().build();
        }

    }

}
