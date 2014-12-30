package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import java.awt.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.appearance.*;

public class SetPriceDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public SetPriceDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setPrefSize(new Dimension(112, 50));
        checkOut.setStyle("popup");
        checkOut.onAttributesInitialized();
        final StaticLayoutData element = new StaticLayoutData();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setResizeOnce(true);
        checkOut.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final BorderLayout element2 = new BorderLayout();
        element2.onCheckOut();
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        final Label element3 = new Label();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setText("%setPrice%".replace("%setPrice%", Xulor.getInstance().getTranslatedString("setPrice")));
        element3.setStyle("smallBoldTitle");
        element2.addBasicElement(element3);
        element3.onAttributesInitialized();
        final BorderLayoutData checkOut2 = BorderLayoutData.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setData(BorderLayoutData.Values.NORTH);
        element3.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        element3.onChildrenAdded();
        final Container checkOut3 = Container.checkOut();
        checkOut3.setElementMap(elementMap);
        element2.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final BorderLayoutData checkOut4 = BorderLayoutData.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setData(BorderLayoutData.Values.CENTER);
        checkOut3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final BorderLayout element4 = new BorderLayout();
        element4.onCheckOut();
        checkOut3.addBasicElement(element4);
        element4.onAttributesInitialized();
        final Button element5 = new Button();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("yellowLeftArrow");
        final MouseReleasedListener onMouseRelease = new MouseReleasedListener();
        onMouseRelease.setCallBackFunc("wakfu.dimensionalBagFlea:stopDecreasingPrice");
        element5.setOnMouseRelease(onMouseRelease);
        final MousePressedListener onMousePress = new MousePressedListener();
        onMousePress.setCallBackFunc("wakfu.dimensionalBagFlea:decreasePrice");
        element5.setOnMousePress(onMousePress);
        element4.addBasicElement(element5);
        element5.onAttributesInitialized();
        final BorderLayoutData checkOut5 = BorderLayoutData.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setData(BorderLayoutData.Values.WEST);
        element5.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        element5.onChildrenAdded();
        final String id = "priceTextEditor";
        final TextEditor textEditor = new TextEditor();
        textEditor.onCheckOut();
        textEditor.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, textEditor);
        }
        textEditor.setStyle("dark");
        textEditor.setPrefSize(new Dimension(60, 0));
        textEditor.setMaxChars(9);
        textEditor.setRestrict("[0-9]+");
        textEditor.setFocused(true);
        final KeyPressedListener onKeyPress = new KeyPressedListener();
        onKeyPress.setCallBackFunc("wakfu.dimensionalBagFlea:validAndClosePricePopUp(priceTextEditor)");
        textEditor.setOnKeyPress(onKeyPress);
        element4.addBasicElement(textEditor);
        textEditor.onAttributesInitialized();
        final PropertyElement checkOut6 = PropertyElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setName("price");
        checkOut6.setAttribute("text");
        textEditor.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final BorderLayoutData checkOut7 = BorderLayoutData.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setData(BorderLayoutData.Values.CENTER);
        textEditor.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final DecoratorAppearance appearance = textEditor.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlign(Alignment9.EAST);
        textEditor.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut8 = Margin.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setInsets(new Insets(8, 0, 5, 0));
        appearance.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        appearance.onChildrenAdded();
        textEditor.onChildrenAdded();
        final Container checkOut9 = Container.checkOut();
        checkOut9.setElementMap(elementMap);
        element4.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        final BorderLayoutData checkOut10 = BorderLayoutData.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setData(BorderLayoutData.Values.EAST);
        checkOut9.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        final BorderLayout element6 = new BorderLayout();
        element6.onCheckOut();
        checkOut9.addBasicElement(element6);
        element6.onAttributesInitialized();
        final Button element7 = new Button();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setStyle("yellowRightArrow");
        final MousePressedListener onMousePress2 = new MousePressedListener();
        onMousePress2.setCallBackFunc("wakfu.dimensionalBagFlea:increasePrice");
        element7.setOnMousePress(onMousePress2);
        element6.addBasicElement(element7);
        element7.onAttributesInitialized();
        final BorderLayoutData checkOut11 = BorderLayoutData.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setData(BorderLayoutData.Values.WEST);
        element7.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        element7.onChildrenAdded();
        final Button element8 = new Button();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.dimensionalBagFlea:validAndClosePricePopUp(priceTextEditor)");
        element8.setOnClick(onClick);
        element8.setStyle("smallValid");
        element6.addBasicElement(element8);
        element8.onAttributesInitialized();
        final BorderLayoutData checkOut12 = BorderLayoutData.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setData(BorderLayoutData.Values.CENTER);
        element8.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        final DecoratorAppearance appearance2 = element8.getAppearance();
        appearance2.setElementMap(elementMap);
        element8.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut13 = Margin.checkOut();
        checkOut13.setElementMap(elementMap);
        checkOut13.setInsets(new Insets(0, 5, 0, 0));
        appearance2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        appearance2.onChildrenAdded();
        element8.onChildrenAdded();
        element6.onChildrenAdded();
        checkOut9.onChildrenAdded();
        element4.onChildrenAdded();
        checkOut3.onChildrenAdded();
        element2.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
}