package br.uniriotec.ppgi.supersensemapping.sampler;

public class Main {

	public static void main(String[] args) {
		int population = 6261;
		double zValue = 1.96;
		double confInterval = .05;
		
		double ss = SampleSizeCalculator.calculateSampleSize(zValue, confInterval);
		double correcterSS = SampleSizeCalculator.correctToFinitePopulation(ss, population);
		System.out.println((int) correcterSS);
		
	}

}
