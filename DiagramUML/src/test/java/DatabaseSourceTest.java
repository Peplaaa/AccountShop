
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
    public void test_price_account1(){
        when(source.getPrice()).thenReturn(20);
        Assert.assertSame(20, database.getSource().getPrice());
    }
    
     @Test
    public void test_price_account2(){
        when(source.getPrice()).thenReturn(50);
        Assert.assertSame(50, database.getSource().getPrice());
    }
    
     @Test
    public void test_fail_price_account1(){
        when(source.getPrice()).thenReturn(100);
        Assert.assertNotSame(10, database.getSource().getPrice());
    }
    
      @Test
    public void test_fail_price_account2(){
        when(source.getPrice()).thenReturn(250);
        Assert.assertNotSame(500, database.getSource().getPrice());
    }
}
