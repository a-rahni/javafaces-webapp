
package fr.m2i.jsfwebapp;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author rahni
 */
@ManagedBean(name = "navigationController", eager = true)
public class NavigationController {

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public String moveToHello() {
        return "hello";
    }

    public String goToPage() {

        if (pageId == null) {
            return "home";
        }

        return pageId;
    }
    
    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

}
