
package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author rahni
 */
@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

   public String moveToHello() {
        return "hello";
    }    
    
}
