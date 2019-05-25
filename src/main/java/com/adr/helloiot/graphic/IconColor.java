//    HelloIoT is a dashboard creator for MQTT
//    Copyright (C) 2017-2019 Adrián Romero Corchado.
//
//    This file is part of HelloIot.
//
//    HelloIot is free software: you can redistribute it and/or modify
//    it under the terms of the GNU General Public License as published by
//    the Free Software Foundation, either version 3 of the License, or
//    (at your option) any later version.
//
//    HelloIot is distributed in the hope that it will be useful,
//    but WITHOUT ANY WARRANTY; without even the implied warranty of
//    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//    GNU General Public License for more details.
//
//    You should have received a copy of the GNU General Public License
//    along with HelloIot.  If not, see <http://www.gnu.org/licenses/>.
//
package com.adr.helloiot.graphic;

import com.adr.fonticon.IconFontGlyph;
import com.adr.fonticon.IconBuilder;
import com.adr.fonticon.IconFont;
import com.adr.helloiotlib.format.StringFormat;
import javafx.scene.Node;
import javafx.scene.paint.Color;

/**
 *
 * @author adrian
 */
public class IconColor extends IconStatus {
    
    private IconFont icon;

    public IconColor(IconFont icon) {
        this.icon = icon;
    }

    public IconColor() {
        this(IconFontGlyph.FA_SOLID_LIGHTBULB);
    }

    @Override
    public Node buildIcon(StringFormat format, byte[] value) {
        Color  c;   
        try {
            c = Color.valueOf(format.value(value).asString());    
        } catch (Exception e) {
            c = Color.BLACK;
        }
        return IconBuilder.create(icon, 48.0).color(c).build();
    }
}
