package com.scienceminer.nerd.utilities;

/**
 * This class is a bean for the YAML configuation data associated to a 
 * language specific NERD.  
 *
 * For each language, we will have a YAML configuration and an instance 
 * of this class. 
 */
public class NerdConfig {
	// ISO 2-digit language code 
	private String langCode;

	// path to the LMDB data
	private String dbDirectory;

	// path to the compiled CSV wikipedia files
	private String dataDirectory;

	// path to the stopwords file to consider for the target language
	// the file is a text file with one stopword per line
	private String stopwords;

	// path to the nerd ranker model	
	private String rankerModel;

	// path to the nerd selector model
	private String selectorModel;

	// minimum of inverse probability (e.g. probability of a string to 
	// realize a given entity considering all the possible strings 
	// that can realize this entity)
	private float minLinkProbability = 0;
	
	// minimum conditional probability of a sense for being an entity 
	// candidate (e.g. min probability of an entity to be realized by a 
	// given string, given all possible entities that can be realized 
	// by this string)
	private float minSenseProbability = 0;

	// if true, use links out for computing relatedness between two 
	// entities in addition to the links in (slower but more precise 
	// in principle)
	private boolean useLinkOut = false;

	// minimum score produced by the selector model under which the entity 
	// will be pruned
	private double minSelectorScore = 0.5; 

	// minimum score produced by the ranker model under which the entity 
	// will be pruned
	private double minRankerScore = 0.1; 

	// Above this frequency, the more frequent terms will be skipped and 
	// not disambiguated - the goal is to speed-up processing by ignoring
	// very frequent word which are likely fonctional and common words
	// not realizing an entity or not realizing an entity of interest
	// frequency is expressed as zipf, i.e. a number typically between 0 and 8:
	// - a term with zipf value 6 appears once per thousand words
	// - a term with Zipf value 3 appears once per million words
	private double maxTermFrequency = 4.0;

	// path to grobid-home
	private String grobidHome = null;

	// if true, the statements are loaded only for concepts having at least one
	// Wikipedia page in a supported language
	private boolean restrictConceptStatementsToWikipediaPages = true;

	// the feature set to be used for the ranker model
	private String rankerFeatures = null;

	// the feature set to be used for the selector model
	private String selectorFeatures = null;

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getDbDirectory() {
		return dbDirectory;
	}

	public void setDbDirectory(String dbDirectory) {
		this.dbDirectory = dbDirectory;
	}	

	public String getDataDirectory() {
		return dataDirectory;
	}

	public void setDataDirectory(String dataDirectory) {
		this.dataDirectory = dataDirectory;
	}	

	public String getStopwords() {
		return stopwords;
	}

	public void setStopwords(String stopwords) {
		this.stopwords = stopwords;
	}

	public String getRankerModel() {
		return rankerModel;
	}

	public void setRankerModel(String rankerModel) {
		this.rankerModel = rankerModel;
	}

	public String getSelectorModel() {
		return selectorModel;
	}

	public void setSelectorModel(String selectorModel) {
		this.selectorModel = selectorModel;
	}

	public float getMinLinkProbability() {
		return minLinkProbability;
	}

	public void setMinLinkProbability(float minLinkProbability) {
		this.minLinkProbability = minLinkProbability;
	}

	public float getMinSenseProbability() {
		return minSenseProbability;
	}

	public void setMinSenseProbability(float minSenseProbability) {
		this.minSenseProbability = minSenseProbability;
	}

	public double getMinSelectorScore() {
		return this.minSelectorScore;
	} 

	public void setMinSelectorScore(double s) {
		this.minSelectorScore = s;
	} 	

	public double getMinRankerScore() {
		return this.minRankerScore;
	} 

	public void setMinRankerScore(double s) {
		this.minRankerScore = s;
	} 	

	public boolean getUseLinkOut() {
		return useLinkOut;
	}

	public void setUseLinkOut(boolean useLinkOut) {
		this.useLinkOut = useLinkOut;
	}

	public double getMaxTermFrequency() {
		return this.maxTermFrequency;
	}

	public void setMaxTermFrequency(double freq) {
		this.maxTermFrequency = freq;
	}

	public String getGrobidHome() {
		return grobidHome;
	}

	public void setGrobidHome(String grobidHome) {
		this.grobidHome = grobidHome;
	}

	public boolean getRestrictConceptStatementsToWikipediaPages() {
		return this.restrictConceptStatementsToWikipediaPages;
	}

	public void setRestrictConceptStatementsToWikipediaPages(boolean restrict) {
		this.restrictConceptStatementsToWikipediaPages = restrict;
	}

	public String getRankerFeatures() {
		return this.rankerFeatures;
	}

	public void setRankerFeatures(String rankerFeatures) {
		this.rankerFeatures = rankerFeatures;
	}

	public String getSelectorFeatures() {
		return this.selectorFeatures;
	}

	public void setSelectorFeatures(String selectorFeatures) {
		this.selectorFeatures = selectorFeatures;
	}
}