
package fr.m2i.jsf.web.app;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="navigationController" , eager = true)
public class NavigationController {
    
    @ManagedProperty(value="#{param.pageId}")
    private String pageId ;
    
    
    
    public String goToPage(){
        if(pageId == null){
            return "home";
        }
        
        return pageId ;
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
        
    public String moveToHelloPage(){
        
        return "hello";
        
    }
}
