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
@ActiveProfiles("ci")
public class B_CIProfileTest {
    
    @Autowired
    private ConfigurationProfile profile;
    
    @Test
    public void propertyPlaceholderConfiguredForProfileCI() {
        
        Assert.assertEquals("Make sure profile \"ci\" has a property placeholder configured with location of file \"ci.properties\".", "Continuous Integration Machine", profile.getName());
    }
}