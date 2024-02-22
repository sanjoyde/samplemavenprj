package samplemavenprj;

import static org.junit.Assert.*;

import org.junit.Test;

import com.test.SampleMavenProject;

public class SampleTest1 {

	@Test
	public void twoPlusTwoEqualsFour() {
		
		SampleMavenProject sampleMavenProject = new SampleMavenProject();
		assertEquals(4, sampleMavenProject.add(2, 2));
	}

}
