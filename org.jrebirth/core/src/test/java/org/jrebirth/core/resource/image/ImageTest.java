package org.jrebirth.core.resource.image;

import static org.junit.Assert.assertEquals;

import javafx.scene.image.Image;

import org.jrebirth.core.resource.ResourceBuilders;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class <strong>ImageTest</strong>.
 * 
 * @author Sébastien Bordes
 */
public class ImageTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void localImage() {

        checkLocalImage(TestImages.TEST_IMAGE_JR_1);
    }

    private void checkLocalImage(final ImageItem imageItem) {
        final Image image = imageItem.get();
        final LocalImage wc = (LocalImage) ResourceBuilders.IMAGE_BUILDER.getParam(imageItem);

        assertEquals(image.getProgress(), 1.0, 0.0);

    }

    @After
    public void tearDown() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

}