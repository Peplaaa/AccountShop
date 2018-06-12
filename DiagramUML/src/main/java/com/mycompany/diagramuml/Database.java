 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.diagramuml;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kamil
 */
public class Database {
    
    private Source source;

    public Source getSource() {
        return source;
    }
    
    
    public List<String> getData(){
        return Collections.singletonList("Account");
    }
    
}
