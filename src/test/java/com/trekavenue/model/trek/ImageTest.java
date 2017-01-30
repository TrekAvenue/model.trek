/**
 * 
 */
package com.trekavenue.model.trek;

import java.util.List;
import java.util.Random;

import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.fakemongo.Fongo;

/**
 * Unit test for Image class.
 * 
 * @author ashutosh
 *
 */
public class ImageTest {
	Logger logger = LoggerFactory.getLogger(ImageTest.class);
	Fongo fongo;
	Morphia morphia;
	Datastore datastore;

	@Before
	private void setup() {
		BasicConfigurator.configure();

		fongo = new Fongo("server");

		morphia = new Morphia();
		morphia.mapPackage("com.trekavenue.model.trek");
		datastore = morphia.createDatastore(fongo.getMongo(), "testDB");
		datastore.ensureIndexes();
	}

	@After
	private void teardown() {
		fongo = null;
		morphia = null;
		datastore = null;
	}

	public Image generateRandomImage() {
		Random random = new Random();
		random.nextInt();
		Image image = new Image(new Random().nextInt(10), 
				"http://example.com/trek/image/111.jpg",
				"http://example.com/trek/thumb/111.jpg");
		return image;
	}
	
	@Test
	@Ignore
	public void testPost() {
		Image image = generateRandomImage();
		datastore.save(image);
		final Query<Image> query = datastore.createQuery(Image.class);
		final List<Image> images = query.asList();
		for(Image img: images) {
			Assert.assertTrue(image.equals(img));
		}
	}
}
