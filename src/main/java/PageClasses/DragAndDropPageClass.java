package PageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.auto.theInternet.IntenetHerokuappPOC.BaseClass;

public class DragAndDropPageClass extends BaseClass {
	
	WebDriver driver; 
	
	@FindBy(css= "#column-a header")
	private WebElement source; 
	
	@FindBy(css= "#column-b header")
	private WebElement dest; 
	
	@FindBy(css= "#column-a header")
	private WebElement textInSource; 
	
	public DragAndDropPageClass(WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public String validateDraggingElement() { 
		Actions action = new Actions(driver); 
		
		//action.dragAndDrop(source, dest).build().perform();
		//action.clickAndHold(source).moveToElement(dest).release().build().perform();
		
		//action.clickAndHold(source)
        //.moveByOffset(100, 0)  
        //.release()
        //.perform();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "function simulateDragDrop(sourceNode, destinationNode) {"
                + "var EVENT_TYPES = {"
                + "    DRAG_END: 'dragend',"
                + "    DRAG_START: 'dragstart',"
                + "    DROP: 'drop'"
                + "};"
                + "function createCustomEvent(type) {"
                + "    var event = new CustomEvent(type, { bubbles: true, cancelable: true });"
                + "    return event;"
                + "}"
                + "sourceNode.dispatchEvent(createCustomEvent(EVENT_TYPES.DRAG_START));"
                + "destinationNode.dispatchEvent(createCustomEvent(EVENT_TYPES.DROP));"
                + "sourceNode.dispatchEvent(createCustomEvent(EVENT_TYPES.DRAG_END));"
                + "}"
                + "simulateDragDrop(arguments[0], arguments[1]);";

        js.executeScript(script, source, dest);

        System.out.println("Drag and Drop performed successfully in Firefox!");
		
		String textInSourceAfterDrag = textInSource.getText(); 
		System.out.println("Text in source box after dragging: " + textInSourceAfterDrag);
		
		return textInSourceAfterDrag;
		
	}
	
	

}
