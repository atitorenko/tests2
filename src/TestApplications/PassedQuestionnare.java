/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestApplications;

import java.lang.String;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author artemsamsonov
 */
public class PassedQuestionnare {
    String userName;
    String userLastname;
    String userSurname;
    String userType;
    ArrayList userResults = new ArrayList();
    
    PassedQuestionnare() {
        
    }
    
    PassedQuestionnare (String a, String b, String c, String d) {
        userName = a;
        userLastname = b;
        userSurname = c;
        userType = d;     
    }
    
}
