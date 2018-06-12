
import com.mycompany.diagramuml.Database;
import com.mycompany.diagramuml.Source;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kamil
 */
@RunWith(MockitoJUnitRunner.class)
public class DatabaseSourceTest {
    
    @InjectMocks
    Database database;
    
    @Mock
    Source source;
    
    @Test
    public void test_data_source(){
        when(source.getPrice()).thenReturn(20);
        Assert.assertSame(20, database.getSource().getPrice());
        Mockito.timeout(0);
    }
    
}
