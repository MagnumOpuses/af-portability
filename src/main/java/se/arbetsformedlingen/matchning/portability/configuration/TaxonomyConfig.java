package se.arbetsformedlingen.matchning.portability.configuration;

import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.annotation.Configuration;
import se.arbetsformedlingen.matchning.taxonomy.repository.Taxonomies;

@Configuration
public class TaxonomyConfig extends AbstractFactoryBean {

    private static final Taxonomies taxonomyRepository = new Taxonomies();

    @Override
    public Class<Taxonomies> getObjectType() {
        return Taxonomies.class;
    }

    @Override
    protected Taxonomies createInstance() throws Exception {
        return taxonomyRepository;
    }
}
