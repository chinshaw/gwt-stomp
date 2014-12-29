package net.nerdrobot.gwt.stomp.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Message extends JavaScriptObject {
    protected Message() {
    }

    public final native Header getHeaders()
    /*-{
        return this.headers;
    }-*/;
    
    public native final void setHeaders(Header headers) /*-{
    	this.headers = headers;
    }-*/;

    public native final String getBody()
    /*-{
        return this.body;
    }-*/;
    
    
    /**
     * Useful for testing your api.
     * @param body
     */
    public native final void setBody(final String body) /*-{
    	this.body = body;
    }-*/;
}
