//    HelloIoT is a dashboard creator for MQTT
//    Copyright (C) 2019 Adrián Romero Corchado.
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
package com.adr.helloiot.topicinfo;

import com.adr.fonticon.IconFontGlyph;
import java.util.ResourceBundle;

public class TopicInfoFactorySwitch implements TopicInfoFactory {
    
    private TopicInfoSwitchNode switchnode = null;
    private final String name;
    
    public TopicInfoFactorySwitch() {
        ResourceBundle resources = ResourceBundle.getBundle("com/adr/helloiot/fxml/clientlogin");
        name = resources.getString("label.topicinfo.Switch");
    }

    @Override
    public String getType() {
        return "Switch";
    }

    @Override
    public String getTypeName() {
        return name;
    }
    
    @Override
    public TopicInfoNode getTopicInfoNode() {
        return switchnode;
    }
    
    @Override
    public TopicInfo create() {
        if (switchnode == null) {
            switchnode = new TopicInfoSwitchNode();
        }
        return new TopicInfoSwitch(this, switchnode);
    }

    @Override
    public IconFontGlyph getGlyph() {
        return IconFontGlyph.FA_SOLID_TOGGLE_ON;
    }
}
