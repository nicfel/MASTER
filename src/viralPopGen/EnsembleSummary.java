package viralPopGen;

import java.util.*;

// COLT RNG classes:
import cern.jet.random.engine.RandomEngine;
import cern.jet.random.engine.MersenneTwister;

/**
 * A class representing a collection of results obtained by
 * estimating moments from an ensemble of trajectories of
 * a birth-death process.  Use this class as an alternative
 * to Ensemble to avoid having to keep a record of every
 * trajectory generated during the calculation.
 * 
 * @author Tim Vaughan
 *
 */
public class EnsembleSummary {

	// Record of simulation parameters:
	Model model;
	State initState;
	double T;
	int Nt, Nsamples, Ntraj;
	int seed;

	// Moments to record:
	ArrayList<Moment> moments;

	/**
	 * Constructor.  Assigns simulation parameters and moment list
	 * to non-static fields, performs the simulation, recording the
	 * required summary statistics.
	 * 
	 * @param model
	 * @param initState
	 * @param t
	 * @param Nt
	 * @param Nsamples
	 * @param Ntraj
	 * @param seed
	 */
	public EnsembleSummary(Model model, State initState, double T, int Nt,
			int Nsamples, int Ntraj, int seed, ArrayList<Moment> moments) {
		super();
		this.model = model;
		this.initState = initState;
		this.T = T;
		this.Nt = Nt;
		this.Nsamples = Nsamples;
		this.Ntraj = Ntraj;
		this.seed = seed;

		// Initialise RNG:
		RandomEngine engine = new MersenneTwister(seed);

	}

	/**
	 * For debugging only.
	 * 
	 * @param argv
	 */
	public static void main(String[] argv) {

	}

}