package com.vaadin.contrib.countdownclock.client;

import com.vaadin.contrib.countdownclock.client.ui.VCountdownClock;
import com.vaadin.terminal.gwt.client.DefaultWidgetSet;
import com.vaadin.terminal.gwt.client.Paintable;
import com.vaadin.terminal.gwt.client.UIDL;

public class CountdownClockWidgetset extends DefaultWidgetSet {

    /** Creates a widget according to its class name. */
    @Override
    public Paintable createWidget(UIDL uidl) {
        final Class<?> classType = resolveWidgetType(uidl);

        Paintable p = createWidgetByClass(classType);
        if (p == null) {
            // Let the DefaultWidgetSet handle creation of default widgets
            p = super.createWidget(uidl);
        }

        return p;
    }

    /** Resolves UIDL tag name to class . */
    @Override
    protected Class<?> resolveWidgetType(UIDL uidl) {
        final String tag = uidl.getTag();

        Class<?> c = resolveWidgetByTag(tag);

        if (c == null) {
            c = super.resolveWidgetType(uidl);
        }

        // Let the DefaultWidgetSet handle resolution of default widgets
        return c;
    }

    // This method gets AUTOGENERATED by Vaadin plugin
    private Paintable createWidgetByClass(Class<?> classType) {
        if (classType == VCountdownClock.class) {
            return new VCountdownClock();
        } else {
            return null;
        }
    }

    // This method gets AUTOGENERATED by Vaadin plugin
    private Class<?> resolveWidgetByTag(final String tag) {
        if (VCountdownClock.TAGNAME.equals(tag)) {
            return VCountdownClock.class;
        } else {
            return null;
        }
    }

}
