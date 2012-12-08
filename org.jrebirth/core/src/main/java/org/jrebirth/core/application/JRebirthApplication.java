/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.core.application;

import java.util.List;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import org.jrebirth.core.ui.Model;
import org.jrebirth.core.wave.Wave;

/**
 * The interface <strong>JRebirthApplication</strong>.
 * 
 * @author Sébastien Bordes
 * 
 * @param <P> the type of the root node of the scene
 */
public interface JRebirthApplication<P extends Pane> {

    /** The default scene width used. */
    int DEFAULT_SCENE_WIDTH = 800;

    /** The default scene height used. */
    int DEFAULT_SCENE_HEIGHT = 600;

    /** The default scene height used. */
    Color DEFAULT_SCENE_BG_COLOR = Color.TRANSPARENT;

    /**
     * @return Returns the stage.
     */
    Stage getStage();

    /**
     * @return Returns the scene.
     */
    Scene getScene();

    /**
     * @return Returns the rootNode.
     */
    P getRootNode();

    /**
     * This method must be implemented to declare which UI Model to display first.
     * 
     * @return the class of the first UI Model to launch
     */
    Class<? extends Model> getFirstModelClass();

    /**
     * Return the Pre-Boot Waves called after displaying the first view.
     * 
     * @return the list of wave to be run before the boot
     */
    List<Wave> getPreBootWaveList();

    /**
     * Return the Post-Boot Waves called after displaying the first view.
     * 
     * @return the list of wave to be run after the boot
     */
    List<Wave> getPostBootWaveList();

}
