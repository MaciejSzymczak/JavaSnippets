package XML;

import org.w3c.dom.*;
import javax.xml.xpath.*;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.*;
import java.io.IOException;
import org.xml.sax.SAXException;	
import java.util.Iterator;

public class XPathDemo {

	//from http://www.roseindia.net/tutorials/xPath/java-xpath.shtml
	//http://blog.davber.com/2006/09/17/xpath-with-namespaces-in-java/

	public static void main(String[] args)throws ParserConfigurationException, SAXException, 
	  IOException, XPathExpressionException {
		  DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
		  domFactory.setNamespaceAware(true); 
		  DocumentBuilder builder = domFactory.newDocumentBuilder();
		  Document doc = builder.parse("roles.xml");
		  
		  /*
		   * alternative way to crete Document doc  
		   *
                String xmlStr =
                    "<?xml version=\"1.0\" ?>\n" +
                    "<Sales xmlns=\"http://www.davber.com/sales-format\">\n" +
                    "<Customer name=\"CostCo, Inc.\">\n" +
                    "<ord:Order xmlns:ord=\"http://www.davber.com/order-format\" price=\"12000\">\n" +
                    "<ord:Description>A bunch of stuff" +
                    "</ord:Description>\n" +
                    "</ord:Order>\n" +
                    "</Customer>\n" +
                    "</Sales>\n";
                DocumentBuilderFactory xmlFact =
                    DocumentBuilderFactory.newInstance();
                xmlFact.setNamespaceAware(true);
                DocumentBuilder builder = xmlFact.
                    newDocumentBuilder();
                Document doc = builder.parse(
                        new java.io.ByteArrayInputStream(
                                xmlStr.getBytes()));

		   */
		  
		  
		  XPath xpath = XPathFactory.newInstance().newXPath();

          // This part might be omitted if you do not use xmlns
		  // [
          NamespaceContext ctx = new NamespaceContext() {
              public String getNamespaceURI(String prefix) {
                  String uri;
                  if (prefix.equals("env"))
                      uri = "http://schemas.xmlsoap.org/soap/envelope/";
                  else if (prefix.equals("xsd"))
                      uri = "http://www.w3.org/2001/XMLSchema";
                  else if (prefix.equals("xsi"))
                      uri = "http://www.w3.org/2001/XMLSchema-instance";
                  else if (prefix.equals("ns0"))
                      uri = "urn:crmondemand/ws/odesabs/role/";
                  else if (prefix.equals("ns1"))
                      uri = "urn:/crmondemand/xml/role/query";
                  else if (prefix.equals("ns2"))
                      uri = "urn:/crmondemand/xml/role/data";
                  else
                      uri = null;
                  return uri;
              }
              
              // Dummy implementation - not used
              public Iterator getPrefixes(String val) {
                  return null;
              }
             
              // Dummy implemenation - not used
              public String getPrefix(String uri) {
                  return null;
              }
          };		  		  
		  xpath.setNamespaceContext(ctx);
		  // ]
		  
		  // XPath Query for showing all nodes value
		  //XPathExpression expr = xpath.compile("//person[1]/*/text()");
		  //XPathExpression expr = xpath.compile("//ns2:Role/ns2:RoleName/text()");
		  //String result = xpath.evaluate(xpathStr, doc);
		  XPathExpression expr = xpath.compile("//ns2:Role/ns2:ListOfRecordTypeAccess/ns2:RecordTypeAccess[ns2:RecordName='Campaign']/ns2:CanCreate/text()");

		  Object result = expr.evaluate(doc, XPathConstants.NODESET);
		  NodeList nodes = (NodeList) result;
		  for (int i = 0; i < nodes.getLength(); i++) {
		     System.out.println(nodes.item(i).getNodeValue()); 
		  }
		  
		  
		  }
		}
