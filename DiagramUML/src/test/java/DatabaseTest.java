
import com.mycompany.diagramuml.Database;
import java.util.Collections;
import java.util.List;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
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
public class DatabaseTest {
    
    @Mock
    Database database;
    
    @Test
    public void test_name_account1(){
        when(database.getData()).thenReturn(Collections.singletonList("Steam"));
        List<String> data = database.getData();
        Assert.assertSame("Steam", data.get(0));
    }
    
     @Test
    public void test_name_account2(){
        when(database.getData()).thenReturn(Collections.singletonList("Origin"));
        List<String> data = database.getData();
        Assert.assertSame("Origin", data.get(0));
    }
    
     @Test
    public void test_name_account3(){
        when(database.getData()).thenReturn(Collections.singletonList("Gameforge"));
        List<String> data = database.getData();
        Assert.assertSame("Gameforge", data.get(0));
    }
    
    @Test
    public void test_fail_name_account1(){
        when(database.getData()).thenReturn(Collections.singletonList("Steam"));
        List<String> data = database.getData();
        Assert.assertNotSame("Account", data.get(0));
    }
    
    @Test
    public void test_fail_name_account2(){
        when(database.getData()).thenReturn(Collections.singletonList("Origin"));
        List<String> data = database.getData();
        Assert.assertNotSame("Account", data.get(0));
    }
    
    @Test
    public void test_fail_name_account3(){
        when(database.getData()).thenReturn(Collections.singletonList("Gameforge"));
        List<String> data = database.getData();
        Assert.assertNotSame("Steam", data.get(0));
    }
    
}


