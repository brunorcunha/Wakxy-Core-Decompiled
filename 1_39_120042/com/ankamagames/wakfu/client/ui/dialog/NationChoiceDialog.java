package com.ankamagames.wakfu.client.ui.dialog;

import java.util.*;
import java.awt.*;
import com.ankamagames.xulor2.util.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.xulor2.appearance.spacing.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.core.renderer.*;
import com.ankamagames.xulor2.core.renderer.condition.*;
import com.ankamagames.xulor2.property.*;
import com.ankamagames.xulor2.event.listener.*;
import com.ankamagames.xulor2.nongraphical.*;
import com.ankamagames.xulor2.layout.*;
import com.ankamagames.xulor2.appearance.*;
import com.ankamagames.xulor2.component.*;

public class NationChoiceDialog implements BasicElementFactory
{
    private Stack<ElementMap> elementMaps;
    private Environment env;
    
    public NationChoiceDialog() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public BasicElement getElement(final Environment env, final ElementMap item) {
        this.env = env;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final Window window = new Window();
        window.onCheckOut();
        window.setElementMap(elementMap);
        window.onAttributesInitialized();
        final StaticLayout element = new StaticLayout();
        element.onCheckOut();
        element.setAdaptToContentSize(true);
        window.addBasicElement(element);
        element.onAttributesInitialized();
        element.onChildrenAdded();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("new");
        window.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut2 = Margin.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setInsets(new Insets(50, 50, 50, 50));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        final StaticLayoutData element2 = new StaticLayoutData();
        element2.onCheckOut();
        element2.setElementMap(elementMap);
        element2.setSize(new Dimension(100.0f, 100.0f));
        checkOut.addBasicElement(element2);
        element2.onAttributesInitialized();
        element2.onChildrenAdded();
        final RowLayout checkOut3 = RowLayout.checkOut();
        checkOut3.setHorizontal(false);
        checkOut3.setAlign(Alignment9.NORTH);
        checkOut.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        checkOut3.onChildrenAdded();
        final WindowMovePoint element3 = new WindowMovePoint();
        element3.onCheckOut();
        element3.setElementMap(elementMap);
        element3.setExpandable(false);
        checkOut.addBasicElement(element3);
        element3.onAttributesInitialized();
        final DecoratorAppearance appearance2 = element3.getAppearance();
        appearance2.setElementMap(elementMap);
        element3.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final Margin checkOut4 = Margin.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setInsets(new Insets(0, 15, 0, 15));
        appearance2.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        appearance2.onChildrenAdded();
        final Container checkOut5 = Container.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setStyle("titleBar");
        element3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        final RowLayout checkOut6 = RowLayout.checkOut();
        checkOut6.setHorizontal(false);
        checkOut5.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final Container checkOut7 = Container.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setExpandable(false);
        checkOut5.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        final RowLayoutData element4 = new RowLayoutData();
        element4.onCheckOut();
        element4.setElementMap(elementMap);
        element4.setAlign(Alignment9.CENTER);
        checkOut7.addBasicElement(element4);
        element4.onAttributesInitialized();
        element4.onChildrenAdded();
        final Label element5 = new Label();
        element5.onCheckOut();
        element5.setElementMap(elementMap);
        element5.setStyle("StyledBold16White");
        element5.setNonBlocking(true);
        element5.setText("%characterCreation.nation%".replace("%characterCreation.nation%", Xulor.getInstance().getTranslatedString("characterCreation.nation")));
        checkOut7.addBasicElement(element5);
        element5.onAttributesInitialized();
        final DecoratorAppearance appearance3 = element5.getAppearance();
        appearance3.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance3).setAlignment(Alignment9.CENTER);
        element5.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        appearance3.onChildrenAdded();
        element5.onChildrenAdded();
        checkOut7.onChildrenAdded();
        checkOut5.onChildrenAdded();
        element3.onChildrenAdded();
        final Container checkOut8 = Container.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        final DecoratorAppearance appearance4 = checkOut8.getAppearance();
        appearance4.setElementMap(elementMap);
        checkOut8.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final Margin checkOut9 = Margin.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setInsets(new Insets(3, 12, 0, 12));
        appearance4.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        appearance4.onChildrenAdded();
        final String id = "windowContentContainer";
        final Container checkOut10 = Container.checkOut();
        checkOut10.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut10);
        }
        checkOut8.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        final RowLayout checkOut11 = RowLayout.checkOut();
        checkOut11.setHorizontal(false);
        checkOut10.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final Container checkOut12 = Container.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setStyle("white");
        checkOut10.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        final StaticLayout element6 = new StaticLayout();
        element6.onCheckOut();
        element6.setAdaptToContentSize(true);
        checkOut12.addBasicElement(element6);
        element6.onAttributesInitialized();
        element6.onChildrenAdded();
        final DecoratorAppearance appearance5 = checkOut12.getAppearance();
        appearance5.setElementMap(elementMap);
        checkOut12.addBasicElement(appearance5);
        appearance5.onAttributesInitialized();
        final Padding element7 = new Padding();
        element7.onCheckOut();
        element7.setElementMap(elementMap);
        element7.setInsets(new Insets(10, 10, 10, 10));
        appearance5.addBasicElement(element7);
        element7.onAttributesInitialized();
        element7.onChildrenAdded();
        appearance5.onChildrenAdded();
        final Image element8 = new Image();
        element8.onCheckOut();
        element8.setElementMap(elementMap);
        checkOut12.addBasicElement(element8);
        element8.onAttributesInitialized();
        final StaticLayoutData element9 = new StaticLayoutData();
        element9.onCheckOut();
        element9.setElementMap(elementMap);
        element9.setSize(new Dimension(696, 522));
        element8.addBasicElement(element9);
        element9.onAttributesInitialized();
        element9.onChildrenAdded();
        final PixmapElement checkOut13 = PixmapElement.checkOut();
        checkOut13.setElementMap(elementMap);
        element8.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        final PropertyElement checkOut14 = PropertyElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setAttribute("texture");
        checkOut14.setName("selectedArchipelago");
        checkOut14.setField("mapIllu");
        checkOut13.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        checkOut13.onChildrenAdded();
        element8.onChildrenAdded();
        final List element10 = new List();
        element10.onCheckOut();
        element10.setElementMap(elementMap);
        element10.setCellSize(new Dimension(348, 261));
        element10.setAutoIdealSize(true);
        element10.setIdealSizeMaxColumns(2);
        element10.setIdealSizeMinColumns(2);
        element10.setIdealSizeMinRows(2);
        element10.setIdealSizeMaxRows(2);
        checkOut12.addBasicElement(element10);
        element10.onAttributesInitialized();
        final StaticLayoutData element11 = new StaticLayoutData();
        element11.onCheckOut();
        element11.setElementMap(elementMap);
        element11.setAlign(Alignment17.CENTER);
        element10.addBasicElement(element11);
        element11.onAttributesInitialized();
        element11.onChildrenAdded();
        final PropertyElement checkOut15 = PropertyElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setAttribute("content");
        checkOut15.setName("nationList");
        element10.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final ItemRenderer element12 = new ItemRenderer();
        element12.onCheckOut();
        element12.setElementMap(elementMap);
        final ItemClickListener onItemClick = new ItemClickListener();
        onItemClick.setCallBackFunc("wakfu.nationChoice:selectNation");
        element12.setOnItemClick(onItemClick);
        final ItemDoubleClickListener onItemDoubleClick = new ItemDoubleClickListener();
        onItemDoubleClick.setCallBackFunc("wakfu.nationChoice:selectDoubleClickNation");
        element12.setOnItemDoubleClick(onItemDoubleClick);
        element10.addBasicElement(element12);
        element12.onAttributesInitialized();
        final ConditionResult element13 = new ConditionResult();
        element13.onCheckOut();
        element13.setElementMap(elementMap);
        element12.addBasicElement(element13);
        element13.onAttributesInitialized();
        final ItemCondition element14 = new ItemCondition();
        element14.onCheckOut();
        element14.setElementMap(elementMap);
        element13.addBasicElement(element14);
        element14.onAttributesInitialized();
        final NotNullCondition element15 = new NotNullCondition();
        element15.onCheckOut();
        element15.setElementMap(elementMap);
        element14.addBasicElement(element15);
        element15.onAttributesInitialized();
        element15.onChildrenAdded();
        element14.onChildrenAdded();
        element13.onChildrenAdded();
        final String id2 = "nation";
        final Data data = new Data();
        data.onCheckOut();
        data.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, data);
        }
        element12.addBasicElement(data);
        data.onAttributesInitialized();
        final ItemElement element16 = new ItemElement();
        element16.onCheckOut();
        element16.setElementMap(elementMap);
        element16.setAttribute("value");
        data.addBasicElement(element16);
        element16.onAttributesInitialized();
        element16.onChildrenAdded();
        data.onChildrenAdded();
        final Container checkOut16 = Container.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setNonBlocking(false);
        element12.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        final StaticLayout element17 = new StaticLayout();
        element17.onCheckOut();
        checkOut16.addBasicElement(element17);
        element17.onAttributesInitialized();
        element17.onChildrenAdded();
        final Image element18 = new Image();
        element18.onCheckOut();
        element18.setElementMap(elementMap);
        element18.setNonBlocking(true);
        checkOut16.addBasicElement(element18);
        element18.onAttributesInitialized();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        element18.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        final ItemElement element19 = new ItemElement();
        element19.onCheckOut();
        element19.setElementMap(elementMap);
        element19.setAttribute("texture");
        element19.setField("buttonIcon");
        checkOut17.addBasicElement(element19);
        element19.onAttributesInitialized();
        element19.onChildrenAdded();
        checkOut17.onChildrenAdded();
        final StaticLayoutData element20 = new StaticLayoutData();
        element20.onCheckOut();
        element20.setElementMap(elementMap);
        element20.setAlign(Alignment17.CENTER);
        element20.setSize(new Dimension(100.0f, 100.0f));
        element18.addBasicElement(element20);
        element20.onAttributesInitialized();
        element20.onChildrenAdded();
        element18.onChildrenAdded();
        final String id3 = "popupReferenceContainer";
        final Container checkOut18 = Container.checkOut();
        checkOut18.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut18);
        }
        checkOut18.setNonBlocking(false);
        final MouseEnteredListener onMouseEnter = new MouseEnteredListener();
        onMouseEnter.setCallBackFunc("wakfu.nationChoice:overNation(nation);popup(nationPopup,popupReferenceContainer)");
        checkOut18.setOnMouseEnter(onMouseEnter);
        final MouseExitedListener onMouseExit = new MouseExitedListener();
        onMouseExit.setCallBackFunc("wakfu.nationChoice:outNation(nation);closePopup");
        checkOut18.setOnMouseExit(onMouseExit);
        checkOut16.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        final StaticLayoutData element21 = new StaticLayoutData();
        element21.onCheckOut();
        element21.setElementMap(elementMap);
        element21.setAlign(Alignment17.CENTER);
        element21.setSize(new Dimension(40.0f, 40.0f));
        checkOut18.addBasicElement(element21);
        element21.onAttributesInitialized();
        element21.onChildrenAdded();
        checkOut18.onChildrenAdded();
        checkOut16.onChildrenAdded();
        element12.onChildrenAdded();
        element10.onChildrenAdded();
        checkOut12.onChildrenAdded();
        final Button element22 = new Button();
        element22.onCheckOut();
        element22.setElementMap(elementMap);
        element22.setText("%back%".replace("%back%", Xulor.getInstance().getTranslatedString("back")));
        element22.setStyle("flat");
        final MouseClickedListener onClick = new MouseClickedListener();
        onClick.setCallBackFunc("wakfu.nationChoice:backToArchipelagoChoice");
        element22.setOnClick(onClick);
        element22.setExpandable(false);
        checkOut10.addBasicElement(element22);
        element22.onAttributesInitialized();
        final DecoratorAppearance appearance6 = element22.getAppearance();
        appearance6.setElementMap(elementMap);
        element22.addBasicElement(appearance6);
        appearance6.onAttributesInitialized();
        final Margin checkOut19 = Margin.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setInsets(new Insets(0, 10, 0, 10));
        appearance6.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final Padding element23 = new Padding();
        element23.onCheckOut();
        element23.setElementMap(elementMap);
        element23.setInsets(new Insets(5, 0, 5, 0));
        appearance6.addBasicElement(element23);
        element23.onAttributesInitialized();
        element23.onChildrenAdded();
        appearance6.onChildrenAdded();
        element22.onChildrenAdded();
        checkOut10.onChildrenAdded();
        checkOut8.onChildrenAdded();
        checkOut.onChildrenAdded();
        final Container checkOut20 = Container.checkOut();
        checkOut20.setElementMap(elementMap);
        window.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        final StaticLayoutData element24 = new StaticLayoutData();
        element24.onCheckOut();
        element24.setElementMap(elementMap);
        element24.setSize(new Dimension(100.0f, 100.0f));
        checkOut20.addBasicElement(element24);
        element24.onAttributesInitialized();
        element24.onChildrenAdded();
        checkOut20.onChildrenAdded();
        final DecoratorAppearance appearance7 = window.getAppearance();
        appearance7.setElementMap(elementMap);
        window.addBasicElement(appearance7);
        appearance7.onAttributesInitialized();
        final Padding element25 = new Padding();
        element25.onCheckOut();
        element25.setElementMap(elementMap);
        element25.setInsets(new Insets(16, 23, 16, 23));
        appearance7.addBasicElement(element25);
        element25.onAttributesInitialized();
        element25.onChildrenAdded();
        appearance7.onChildrenAdded();
        final StaticLayoutData element26 = new StaticLayoutData();
        element26.onCheckOut();
        element26.setElementMap(elementMap);
        element26.setSize(new Dimension(-2, -2));
        element26.setAlign(Alignment17.CENTER);
        element26.setInitValue(true);
        window.addBasicElement(element26);
        element26.onAttributesInitialized();
        element26.onChildrenAdded();
        final String id4 = "nationPopup";
        final PopupElement popupElement = new PopupElement();
        popupElement.onCheckOut();
        popupElement.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, popupElement);
        }
        popupElement.setAlign(Alignment9.NORTH);
        popupElement.setHotSpotPosition(Alignment9.SOUTH);
        window.addBasicElement(popupElement);
        popupElement.onAttributesInitialized();
        final Container checkOut21 = Container.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setPrefSize(new Dimension(112, 50));
        checkOut21.setStyle("popup");
        popupElement.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        final StaticLayoutData element27 = new StaticLayoutData();
        element27.onCheckOut();
        element27.setElementMap(elementMap);
        element27.setResizeOnce(true);
        checkOut21.addBasicElement(element27);
        element27.onAttributesInitialized();
        element27.onChildrenAdded();
        final DecoratorAppearance appearance8 = checkOut21.getAppearance();
        appearance8.setElementMap(elementMap);
        checkOut21.addBasicElement(appearance8);
        appearance8.onAttributesInitialized();
        final Margin checkOut22 = Margin.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setInsets(new Insets(0, 5, 0, 5));
        appearance8.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        appearance8.onChildrenAdded();
        final RowLayout checkOut23 = RowLayout.checkOut();
        checkOut23.setAlign(Alignment9.NORTH);
        checkOut23.setHorizontal(false);
        checkOut21.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        checkOut23.onChildrenAdded();
        final Container checkOut24 = Container.checkOut();
        checkOut24.setElementMap(elementMap);
        checkOut21.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        final BorderLayout element28 = new BorderLayout();
        element28.onCheckOut();
        checkOut24.addBasicElement(element28);
        element28.onAttributesInitialized();
        element28.onChildrenAdded();
        final Label element29 = new Label();
        element29.onCheckOut();
        element29.setElementMap(elementMap);
        element29.setStyle("BigTitle");
        element29.setMinWidth(200);
        element29.setMaxWidth(200);
        checkOut24.addBasicElement(element29);
        element29.onAttributesInitialized();
        final PropertyElement checkOut25 = PropertyElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setAttribute("text");
        checkOut25.setName("overNation");
        checkOut25.setField("name");
        element29.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final DecoratorAppearance appearance9 = element29.getAppearance();
        appearance9.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance9).setAlignment(Alignment9.CENTER);
        element29.addBasicElement(appearance9);
        appearance9.onAttributesInitialized();
        appearance9.onChildrenAdded();
        final BorderLayoutData checkOut26 = BorderLayoutData.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setData(BorderLayoutData.Values.WEST);
        element29.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        element29.onChildrenAdded();
        final Image element30 = new Image();
        element30.onCheckOut();
        element30.setElementMap(elementMap);
        element30.setDisplaySize(new Dimension(22, 22));
        checkOut24.addBasicElement(element30);
        element30.onAttributesInitialized();
        final BorderLayoutData checkOut27 = BorderLayoutData.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setData(BorderLayoutData.Values.EAST);
        element30.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        element30.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        final PropertyElement checkOut29 = PropertyElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setAttribute("texture");
        checkOut29.setName("overNation");
        checkOut29.setField("flagIconUrl");
        checkOut28.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        checkOut28.onChildrenAdded();
        element30.onChildrenAdded();
        checkOut24.onChildrenAdded();
        final Container checkOut30 = Container.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setExpandable(false);
        checkOut30.setStyle("lineSeparator");
        checkOut30.setPrefSize(new Dimension(0, 7));
        checkOut21.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        this.method0(checkOut30);
        checkOut30.onChildrenAdded();
        this.method1(checkOut21);
        this.method2(checkOut21);
        this.method3(checkOut21);
        checkOut21.onChildrenAdded();
        popupElement.onChildrenAdded();
        window.onChildrenAdded();
        return window;
    }
    
    public BasicElement method0(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = ((Widget)basicElement).getAppearance();
        appearance.setElementMap(elementMap);
        basicElement.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut = Margin.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setInsets(new Insets(5, 0, 2, 0));
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        appearance.onChildrenAdded();
        return appearance;
    }
    
    public BasicElement method1(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final TextView element = new TextView();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setStyle("white");
        element.setMinWidth(200);
        element.setMaxWidth(200);
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final PropertyElement checkOut = PropertyElement.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setAttribute("text");
        checkOut.setName("overNation");
        checkOut.setField("description");
        element.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final DecoratorAppearance appearance = element.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlignment(Alignment9.CENTER);
        element.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        appearance.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
    
    public BasicElement method2(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Container checkOut = Container.checkOut();
        checkOut.setElementMap(elementMap);
        checkOut.setStyle("lineSeparator");
        checkOut.setPrefSize(new Dimension(0, 7));
        basicElement.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        final DecoratorAppearance appearance = checkOut.getAppearance();
        appearance.setElementMap(elementMap);
        checkOut.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final Margin checkOut2 = Margin.checkOut();
        checkOut2.setElementMap(elementMap);
        checkOut2.setInsets(new Insets(5, 0, 2, 0));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        appearance.onChildrenAdded();
        checkOut.onChildrenAdded();
        return checkOut;
    }
    
    public BasicElement method3(final BasicElement basicElement) {
        final ElementMap elementMap = this.elementMaps.peek();
        final Label element = new Label();
        element.onCheckOut();
        element.setElementMap(elementMap);
        element.setText("%doubleClickToValid%".replace("%doubleClickToValid%", Xulor.getInstance().getTranslatedString("doubleClickToValid")));
        element.setStyle("PopupInformation");
        basicElement.addBasicElement(element);
        element.onAttributesInitialized();
        final DecoratorAppearance appearance = element.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlignment(Alignment9.CENTER);
        element.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        appearance.onChildrenAdded();
        element.onChildrenAdded();
        return element;
    }
}
