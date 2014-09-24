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
@ActiveProfiles("dev")
public class A_DevDefaultProfileTest {
    
    @Autowired
    private ConfigurationProfile profile;
    
    @Test
    public void propertyPlaceholderConfiguredForProfileDefaultDev() {
        
        Assert.assertEquals("Make sure profile \"default,dev\" has a property placeholder configured with location of file \"default.properties\".", "Development Machine", profile.getName());
    }
}