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

public class TopicInfoFactorySend implements TopicInfoFactory {
    
    private TopicInfoEditNode editnode = null;
    private final String name;
    
    public TopicInfoFactorySend() {
        ResourceBundle resources = ResourceBundle.getBundle("com/adr/helloiot/fxml/clientlogin");
        name = resources.getString("label.topicinfo.Send");
    }

    @Override
    public String getType() {
        return "Send";
    }

    @Override
    public String getTypeName() {
        return name;
    }
    
    @Override
    public TopicInfoNode getTopicInfoNode() {
        return editnode;
    }
    
    @Override
    public TopicInfo create() {
        if (editnode == null) {
            editnode = new TopicInfoEditNode();
            editnode.labeltopic.setDisable(true);
            editnode.edittopic.setDisable(true);            
        }
        return new TopicInfoSend(this, editnode);
    }

    @Override
    public IconFontGlyph getGlyph() {
        return IconFontGlyph.FA_SOLID_SHARE;  
    }
}
