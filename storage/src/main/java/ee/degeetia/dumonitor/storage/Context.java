package ee.degeetia.dumonitor.storage;

import org.apache.logging.log4j.Logger;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.HashMap;
import java.util.Map;

import org.w3c.dom.Document;

public class Context {
    // general globals
    public HttpServletRequest req; 
    public HttpServletResponse resp;
    public ServletOutputStream os; // stream to write output
    public Logger log; // logging class
    public String contentType; // response http content type 
    public Map<String, String> inParams; // parsed params stored here   
  
    // xroad globals
    public Document xmldoc; // parsed xml stored here for xroad  
    public String xrdRequest="";  // converted to str from parsed request 
    // these come from the request SOAP xrd header:
    public String xrdConsumer=""; 
    public String xrdProducer="";
    public String xrdUserId="";
    public String xrdId="";
    public String xrdService="";
    public String xrdIssue=""; 
  
    public Context(HttpServletRequest req, HttpServletResponse resp,
        ServletOutputStream os, Logger log,  
        String contentType, Map<String, String> inParams) {
      this.req = req;
      this.resp = resp;
      this.os = os;
      this.log = log;     
      this.contentType=contentType;    
      this.inParams = inParams;           
    }
}