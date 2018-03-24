import  lab14lib.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Generator generator = new StrangeBitwiseGenerator(1024);
		GeneratorAudioVisualizer gav = new GeneratorAudioVisualizer(generator);
		gav.drawAndPlay(128000, 1000000);
	}
} 