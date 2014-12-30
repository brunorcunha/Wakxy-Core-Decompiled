package com.ankamagames.wakfu.client.ui.theme;

import java.util.*;
import com.ankamagames.xulor2.component.*;
import com.ankamagames.xulor2.*;
import com.ankamagames.xulor2.core.*;
import com.ankamagames.framework.graphics.image.*;
import com.ankamagames.xulor2.util.alignment.*;
import com.ankamagames.xulor2.decorator.*;
import com.ankamagames.xulor2.appearance.*;

public class ButtonBigpoint implements StyleSetter
{
    private DocumentParser doc;
    private Stack<ElementMap> elementMaps;
    
    public ButtonBigpoint() {
        super();
        this.elementMaps = new Stack<ElementMap>();
    }
    
    @Override
    public void applyStyle(final ElementMap item, final DocumentParser doc, final Widget widget) {
        this.doc = doc;
        this.elementMaps.push(item);
        final ElementMap elementMap = this.elementMaps.peek();
        final DecoratorAppearance appearance = widget.getAppearance();
        appearance.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance).setAlignment(Alignment9.CENTER);
        appearance.setState("default");
        widget.addBasicElement(appearance);
        appearance.onAttributesInitialized();
        final FontElement checkOut = FontElement.checkOut();
        checkOut.setRenderer(Xulor.getInstance().getDocumentParser().getFont("defaultTitleFont"));
        checkOut.setElementMap(elementMap);
        appearance.addBasicElement(checkOut);
        checkOut.onAttributesInitialized();
        checkOut.onChildrenAdded();
        final String id = "whiteColor";
        final ColorElement checkOut2 = ColorElement.checkOut();
        checkOut2.setElementMap(elementMap);
        if (elementMap != null && id != null) {
            elementMap.add(id, checkOut2);
        }
        checkOut2.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance.addBasicElement(checkOut2);
        checkOut2.onAttributesInitialized();
        checkOut2.onChildrenAdded();
        final String id2 = "bigpointButtonBackgroundDefault";
        final PixmapBackground checkOut3 = PixmapBackground.checkOut();
        checkOut3.setElementMap(elementMap);
        if (elementMap != null && id2 != null) {
            elementMap.add(id2, checkOut3);
        }
        appearance.addBasicElement(checkOut3);
        checkOut3.onAttributesInitialized();
        final PixmapElement checkOut4 = PixmapElement.checkOut();
        checkOut4.setElementMap(elementMap);
        checkOut4.setHeight(70);
        checkOut4.setPosition(Alignment17.NORTH_WEST);
        checkOut4.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut4.setWidth(70);
        checkOut4.setX(323);
        checkOut4.setY(479);
        checkOut3.addBasicElement(checkOut4);
        checkOut4.onAttributesInitialized();
        checkOut4.onChildrenAdded();
        final PixmapElement checkOut5 = PixmapElement.checkOut();
        checkOut5.setElementMap(elementMap);
        checkOut5.setHeight(70);
        checkOut5.setPosition(Alignment17.NORTH);
        checkOut5.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut5.setWidth(1);
        checkOut5.setX(469);
        checkOut5.setY(666);
        checkOut3.addBasicElement(checkOut5);
        checkOut5.onAttributesInitialized();
        checkOut5.onChildrenAdded();
        final PixmapElement checkOut6 = PixmapElement.checkOut();
        checkOut6.setElementMap(elementMap);
        checkOut6.setHeight(70);
        checkOut6.setPosition(Alignment17.NORTH_EAST);
        checkOut6.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut6.setWidth(6);
        checkOut6.setX(193);
        checkOut6.setY(678);
        checkOut3.addBasicElement(checkOut6);
        checkOut6.onAttributesInitialized();
        checkOut6.onChildrenAdded();
        final PixmapElement checkOut7 = PixmapElement.checkOut();
        checkOut7.setElementMap(elementMap);
        checkOut7.setHeight(0);
        checkOut7.setPosition(Alignment17.EAST);
        checkOut7.setWidth(6);
        checkOut7.setX(872);
        checkOut7.setY(6);
        checkOut3.addBasicElement(checkOut7);
        checkOut7.onAttributesInitialized();
        checkOut7.onChildrenAdded();
        final PixmapElement checkOut8 = PixmapElement.checkOut();
        checkOut8.setElementMap(elementMap);
        checkOut8.setHeight(0);
        checkOut8.setPosition(Alignment17.SOUTH_EAST);
        checkOut8.setWidth(6);
        checkOut8.setX(872);
        checkOut8.setY(20);
        checkOut3.addBasicElement(checkOut8);
        checkOut8.onAttributesInitialized();
        checkOut8.onChildrenAdded();
        final PixmapElement checkOut9 = PixmapElement.checkOut();
        checkOut9.setElementMap(elementMap);
        checkOut9.setHeight(0);
        checkOut9.setPosition(Alignment17.SOUTH);
        checkOut9.setWidth(1);
        checkOut9.setX(868);
        checkOut9.setY(20);
        checkOut3.addBasicElement(checkOut9);
        checkOut9.onAttributesInitialized();
        checkOut9.onChildrenAdded();
        final PixmapElement checkOut10 = PixmapElement.checkOut();
        checkOut10.setElementMap(elementMap);
        checkOut10.setHeight(0);
        checkOut10.setPosition(Alignment17.SOUTH_WEST);
        checkOut10.setWidth(70);
        checkOut10.setX(795);
        checkOut10.setY(20);
        checkOut3.addBasicElement(checkOut10);
        checkOut10.onAttributesInitialized();
        checkOut10.onChildrenAdded();
        final PixmapElement checkOut11 = PixmapElement.checkOut();
        checkOut11.setElementMap(elementMap);
        checkOut11.setHeight(0);
        checkOut11.setPosition(Alignment17.WEST);
        checkOut11.setWidth(70);
        checkOut11.setX(795);
        checkOut11.setY(6);
        checkOut3.addBasicElement(checkOut11);
        checkOut11.onAttributesInitialized();
        checkOut11.onChildrenAdded();
        final PixmapElement checkOut12 = PixmapElement.checkOut();
        checkOut12.setElementMap(elementMap);
        checkOut12.setHeight(0);
        checkOut12.setPosition(Alignment17.CENTER);
        checkOut12.setWidth(1);
        checkOut12.setX(868);
        checkOut12.setY(6);
        checkOut3.addBasicElement(checkOut12);
        checkOut12.onAttributesInitialized();
        checkOut12.onChildrenAdded();
        checkOut3.onChildrenAdded();
        appearance.onChildrenAdded();
        final DecoratorAppearance appearance2 = widget.getAppearance();
        appearance2.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance2).setAlignment(Alignment9.CENTER);
        appearance2.setState("mouseHover");
        widget.addBasicElement(appearance2);
        appearance2.onAttributesInitialized();
        final String id3 = "whiteColor";
        final ColorElement checkOut13 = ColorElement.checkOut();
        checkOut13.setElementMap(elementMap);
        if (elementMap != null && id3 != null) {
            elementMap.add(id3, checkOut13);
        }
        checkOut13.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance2.addBasicElement(checkOut13);
        checkOut13.onAttributesInitialized();
        checkOut13.onChildrenAdded();
        final String id4 = "bigpointButtonBackgroundOver";
        final PixmapBorder pixmapBorder = new PixmapBorder();
        pixmapBorder.onCheckOut();
        pixmapBorder.setElementMap(elementMap);
        if (elementMap != null && id4 != null) {
            elementMap.add(id4, pixmapBorder);
        }
        pixmapBorder.setEnabled(false);
        appearance2.addBasicElement(pixmapBorder);
        pixmapBorder.onAttributesInitialized();
        final PixmapElement checkOut14 = PixmapElement.checkOut();
        checkOut14.setElementMap(elementMap);
        checkOut14.setHeight(70);
        checkOut14.setPosition(Alignment17.NORTH_WEST);
        checkOut14.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut14.setWidth(70);
        checkOut14.setX(698);
        checkOut14.setY(479);
        pixmapBorder.addBasicElement(checkOut14);
        checkOut14.onAttributesInitialized();
        checkOut14.onChildrenAdded();
        final PixmapElement checkOut15 = PixmapElement.checkOut();
        checkOut15.setElementMap(elementMap);
        checkOut15.setHeight(70);
        checkOut15.setPosition(Alignment17.NORTH);
        checkOut15.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut15.setWidth(1);
        checkOut15.setX(481);
        checkOut15.setY(666);
        pixmapBorder.addBasicElement(checkOut15);
        checkOut15.onAttributesInitialized();
        checkOut15.onChildrenAdded();
        final PixmapElement checkOut16 = PixmapElement.checkOut();
        checkOut16.setElementMap(elementMap);
        checkOut16.setHeight(70);
        checkOut16.setPosition(Alignment17.NORTH_EAST);
        checkOut16.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut16.setWidth(6);
        checkOut16.setX(460);
        checkOut16.setY(666);
        pixmapBorder.addBasicElement(checkOut16);
        checkOut16.onAttributesInitialized();
        checkOut16.onChildrenAdded();
        final PixmapElement checkOut17 = PixmapElement.checkOut();
        checkOut17.setElementMap(elementMap);
        checkOut17.setHeight(0);
        checkOut17.setPosition(Alignment17.EAST);
        checkOut17.setWidth(6);
        checkOut17.setX(872);
        checkOut17.setY(6);
        pixmapBorder.addBasicElement(checkOut17);
        checkOut17.onAttributesInitialized();
        checkOut17.onChildrenAdded();
        final PixmapElement checkOut18 = PixmapElement.checkOut();
        checkOut18.setElementMap(elementMap);
        checkOut18.setHeight(0);
        checkOut18.setPosition(Alignment17.SOUTH_EAST);
        checkOut18.setWidth(6);
        checkOut18.setX(872);
        checkOut18.setY(20);
        pixmapBorder.addBasicElement(checkOut18);
        checkOut18.onAttributesInitialized();
        checkOut18.onChildrenAdded();
        final PixmapElement checkOut19 = PixmapElement.checkOut();
        checkOut19.setElementMap(elementMap);
        checkOut19.setHeight(0);
        checkOut19.setPosition(Alignment17.SOUTH);
        checkOut19.setWidth(1);
        checkOut19.setX(868);
        checkOut19.setY(20);
        pixmapBorder.addBasicElement(checkOut19);
        checkOut19.onAttributesInitialized();
        checkOut19.onChildrenAdded();
        final PixmapElement checkOut20 = PixmapElement.checkOut();
        checkOut20.setElementMap(elementMap);
        checkOut20.setHeight(0);
        checkOut20.setPosition(Alignment17.SOUTH_WEST);
        checkOut20.setWidth(70);
        checkOut20.setX(795);
        checkOut20.setY(20);
        pixmapBorder.addBasicElement(checkOut20);
        checkOut20.onAttributesInitialized();
        checkOut20.onChildrenAdded();
        final PixmapElement checkOut21 = PixmapElement.checkOut();
        checkOut21.setElementMap(elementMap);
        checkOut21.setHeight(0);
        checkOut21.setPosition(Alignment17.WEST);
        checkOut21.setWidth(70);
        checkOut21.setX(795);
        checkOut21.setY(6);
        pixmapBorder.addBasicElement(checkOut21);
        checkOut21.onAttributesInitialized();
        checkOut21.onChildrenAdded();
        final PixmapElement checkOut22 = PixmapElement.checkOut();
        checkOut22.setElementMap(elementMap);
        checkOut22.setHeight(0);
        checkOut22.setPosition(Alignment17.CENTER);
        checkOut22.setWidth(1);
        checkOut22.setX(868);
        checkOut22.setY(6);
        pixmapBorder.addBasicElement(checkOut22);
        checkOut22.onAttributesInitialized();
        checkOut22.onChildrenAdded();
        pixmapBorder.onChildrenAdded();
        appearance2.onChildrenAdded();
        final DecoratorAppearance appearance3 = widget.getAppearance();
        appearance3.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance3).setAlignment(Alignment9.CENTER);
        appearance3.setState("pressed");
        widget.addBasicElement(appearance3);
        appearance3.onAttributesInitialized();
        final String id5 = "whiteColor";
        final ColorElement checkOut23 = ColorElement.checkOut();
        checkOut23.setElementMap(elementMap);
        if (elementMap != null && id5 != null) {
            elementMap.add(id5, checkOut23);
        }
        checkOut23.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance3.addBasicElement(checkOut23);
        checkOut23.onAttributesInitialized();
        checkOut23.onChildrenAdded();
        final String id6 = "bigpointButtonBackgroundPressed";
        final PixmapBackground checkOut24 = PixmapBackground.checkOut();
        checkOut24.setElementMap(elementMap);
        if (elementMap != null && id6 != null) {
            elementMap.add(id6, checkOut24);
        }
        checkOut24.setEnabled(false);
        appearance3.addBasicElement(checkOut24);
        checkOut24.onAttributesInitialized();
        final PixmapElement checkOut25 = PixmapElement.checkOut();
        checkOut25.setElementMap(elementMap);
        checkOut25.setHeight(70);
        checkOut25.setPosition(Alignment17.NORTH_WEST);
        checkOut25.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut25.setWidth(70);
        checkOut25.setX(239);
        checkOut25.setY(474);
        checkOut24.addBasicElement(checkOut25);
        checkOut25.onAttributesInitialized();
        checkOut25.onChildrenAdded();
        final PixmapElement checkOut26 = PixmapElement.checkOut();
        checkOut26.setElementMap(elementMap);
        checkOut26.setHeight(70);
        checkOut26.setPosition(Alignment17.NORTH);
        checkOut26.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut26.setWidth(1);
        checkOut26.setX(477);
        checkOut26.setY(666);
        checkOut24.addBasicElement(checkOut26);
        checkOut26.onAttributesInitialized();
        checkOut26.onChildrenAdded();
        final PixmapElement checkOut27 = PixmapElement.checkOut();
        checkOut27.setElementMap(elementMap);
        checkOut27.setHeight(70);
        checkOut27.setPosition(Alignment17.NORTH_EAST);
        checkOut27.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut27.setWidth(6);
        checkOut27.setX(184);
        checkOut27.setY(751);
        checkOut24.addBasicElement(checkOut27);
        checkOut27.onAttributesInitialized();
        checkOut27.onChildrenAdded();
        final PixmapElement checkOut28 = PixmapElement.checkOut();
        checkOut28.setElementMap(elementMap);
        checkOut28.setHeight(0);
        checkOut28.setPosition(Alignment17.EAST);
        checkOut28.setWidth(6);
        checkOut28.setX(872);
        checkOut28.setY(6);
        checkOut24.addBasicElement(checkOut28);
        checkOut28.onAttributesInitialized();
        checkOut28.onChildrenAdded();
        final PixmapElement checkOut29 = PixmapElement.checkOut();
        checkOut29.setElementMap(elementMap);
        checkOut29.setHeight(0);
        checkOut29.setPosition(Alignment17.SOUTH_EAST);
        checkOut29.setWidth(6);
        checkOut29.setX(872);
        checkOut29.setY(20);
        checkOut24.addBasicElement(checkOut29);
        checkOut29.onAttributesInitialized();
        checkOut29.onChildrenAdded();
        final PixmapElement checkOut30 = PixmapElement.checkOut();
        checkOut30.setElementMap(elementMap);
        checkOut30.setHeight(0);
        checkOut30.setPosition(Alignment17.SOUTH);
        checkOut30.setWidth(1);
        checkOut30.setX(868);
        checkOut30.setY(20);
        checkOut24.addBasicElement(checkOut30);
        checkOut30.onAttributesInitialized();
        checkOut30.onChildrenAdded();
        final PixmapElement checkOut31 = PixmapElement.checkOut();
        checkOut31.setElementMap(elementMap);
        checkOut31.setHeight(0);
        checkOut31.setPosition(Alignment17.SOUTH_WEST);
        checkOut31.setWidth(70);
        checkOut31.setX(795);
        checkOut31.setY(20);
        checkOut24.addBasicElement(checkOut31);
        checkOut31.onAttributesInitialized();
        checkOut31.onChildrenAdded();
        final PixmapElement checkOut32 = PixmapElement.checkOut();
        checkOut32.setElementMap(elementMap);
        checkOut32.setHeight(0);
        checkOut32.setPosition(Alignment17.WEST);
        checkOut32.setWidth(70);
        checkOut32.setX(795);
        checkOut32.setY(6);
        checkOut24.addBasicElement(checkOut32);
        checkOut32.onAttributesInitialized();
        checkOut32.onChildrenAdded();
        final PixmapElement checkOut33 = PixmapElement.checkOut();
        checkOut33.setElementMap(elementMap);
        checkOut33.setHeight(0);
        checkOut33.setPosition(Alignment17.CENTER);
        checkOut33.setWidth(1);
        checkOut33.setX(868);
        checkOut33.setY(6);
        checkOut24.addBasicElement(checkOut33);
        checkOut33.onAttributesInitialized();
        checkOut33.onChildrenAdded();
        checkOut24.onChildrenAdded();
        appearance3.onChildrenAdded();
        final DecoratorAppearance appearance4 = widget.getAppearance();
        appearance4.setElementMap(elementMap);
        ((TextWidgetAppearance)appearance4).setAlignment(Alignment9.CENTER);
        appearance4.setState("disabled");
        widget.addBasicElement(appearance4);
        appearance4.onAttributesInitialized();
        final String id7 = "whiteColor";
        final ColorElement checkOut34 = ColorElement.checkOut();
        checkOut34.setElementMap(elementMap);
        if (elementMap != null && id7 != null) {
            elementMap.add(id7, checkOut34);
        }
        checkOut34.setColor(new Color(1.0f, 1.0f, 1.0f, 1.0f));
        appearance4.addBasicElement(checkOut34);
        checkOut34.onAttributesInitialized();
        checkOut34.onChildrenAdded();
        final String id8 = "bigpointButtonBackgroundDisabled";
        final PixmapBackground checkOut35 = PixmapBackground.checkOut();
        checkOut35.setElementMap(elementMap);
        if (elementMap != null && id8 != null) {
            elementMap.add(id8, checkOut35);
        }
        checkOut35.setEnabled(false);
        appearance4.addBasicElement(checkOut35);
        checkOut35.onAttributesInitialized();
        final PixmapElement checkOut36 = PixmapElement.checkOut();
        checkOut36.setElementMap(elementMap);
        checkOut36.setHeight(70);
        checkOut36.setPosition(Alignment17.NORTH_WEST);
        checkOut36.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut36.setWidth(70);
        checkOut36.setX(822);
        checkOut36.setY(481);
        checkOut35.addBasicElement(checkOut36);
        checkOut36.onAttributesInitialized();
        checkOut36.onChildrenAdded();
        final PixmapElement checkOut37 = PixmapElement.checkOut();
        checkOut37.setElementMap(elementMap);
        checkOut37.setHeight(70);
        checkOut37.setPosition(Alignment17.NORTH);
        checkOut37.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut37.setWidth(1);
        checkOut37.setX(473);
        checkOut37.setY(666);
        checkOut35.addBasicElement(checkOut37);
        checkOut37.onAttributesInitialized();
        checkOut37.onChildrenAdded();
        final PixmapElement checkOut38 = PixmapElement.checkOut();
        checkOut38.setElementMap(elementMap);
        checkOut38.setHeight(70);
        checkOut38.setPosition(Alignment17.NORTH_EAST);
        checkOut38.setTexture(this.doc.getTexture("default_0.tga"));
        checkOut38.setWidth(6);
        checkOut38.setX(193);
        checkOut38.setY(751);
        checkOut35.addBasicElement(checkOut38);
        checkOut38.onAttributesInitialized();
        checkOut38.onChildrenAdded();
        final PixmapElement checkOut39 = PixmapElement.checkOut();
        checkOut39.setElementMap(elementMap);
        checkOut39.setHeight(0);
        checkOut39.setPosition(Alignment17.EAST);
        checkOut39.setWidth(6);
        checkOut39.setX(872);
        checkOut39.setY(6);
        checkOut35.addBasicElement(checkOut39);
        checkOut39.onAttributesInitialized();
        checkOut39.onChildrenAdded();
        final PixmapElement checkOut40 = PixmapElement.checkOut();
        checkOut40.setElementMap(elementMap);
        checkOut40.setHeight(0);
        checkOut40.setPosition(Alignment17.SOUTH_EAST);
        checkOut40.setWidth(6);
        checkOut40.setX(872);
        checkOut40.setY(20);
        checkOut35.addBasicElement(checkOut40);
        checkOut40.onAttributesInitialized();
        checkOut40.onChildrenAdded();
        final PixmapElement checkOut41 = PixmapElement.checkOut();
        checkOut41.setElementMap(elementMap);
        checkOut41.setHeight(0);
        checkOut41.setPosition(Alignment17.SOUTH);
        checkOut41.setWidth(1);
        checkOut41.setX(868);
        checkOut41.setY(20);
        checkOut35.addBasicElement(checkOut41);
        checkOut41.onAttributesInitialized();
        checkOut41.onChildrenAdded();
        final PixmapElement checkOut42 = PixmapElement.checkOut();
        checkOut42.setElementMap(elementMap);
        checkOut42.setHeight(0);
        checkOut42.setPosition(Alignment17.SOUTH_WEST);
        checkOut42.setWidth(70);
        checkOut42.setX(795);
        checkOut42.setY(20);
        checkOut35.addBasicElement(checkOut42);
        checkOut42.onAttributesInitialized();
        checkOut42.onChildrenAdded();
        final PixmapElement checkOut43 = PixmapElement.checkOut();
        checkOut43.setElementMap(elementMap);
        checkOut43.setHeight(0);
        checkOut43.setPosition(Alignment17.WEST);
        checkOut43.setWidth(70);
        checkOut43.setX(795);
        checkOut43.setY(6);
        checkOut35.addBasicElement(checkOut43);
        checkOut43.onAttributesInitialized();
        checkOut43.onChildrenAdded();
        final PixmapElement checkOut44 = PixmapElement.checkOut();
        checkOut44.setElementMap(elementMap);
        checkOut44.setHeight(0);
        checkOut44.setPosition(Alignment17.CENTER);
        checkOut44.setWidth(1);
        checkOut44.setX(868);
        checkOut44.setY(6);
        checkOut35.addBasicElement(checkOut44);
        checkOut44.onAttributesInitialized();
        checkOut44.onChildrenAdded();
        checkOut35.onChildrenAdded();
        appearance4.onChildrenAdded();
    }
}