package PropertyProfiles;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import tuntikirjaus.domain.ConfigurationProfile;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/front-controller-servlet.xml"})
@ActiveProfiles("production")
public class C_ProductionProfileTest {
    
    @Autowired
    private ConfigurationProfile profile;
    
    @Test
    public void propertyPlaceholderConfiguredForProfileProduction() {
        
        Assert.assertEquals("Make sure profile \"production\" has a property placeholder configured with location of file \"production.properties\".", "Production Machine", profile.getName());
    }
}