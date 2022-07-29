
package fr.m2i.jsf.web.app;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="message" , eager = true)
public class Message {
    
    private String message ;
    
    public Message(){
        this.message = "UBISOFT GOES STEAMWORK BYE BYE , ALWAYS ON DRM ";
               
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
