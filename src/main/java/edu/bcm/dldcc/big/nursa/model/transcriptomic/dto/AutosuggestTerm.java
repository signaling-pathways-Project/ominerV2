package edu.bcm.dldcc.big.nursa.model.transcriptomic.dto;

/**
 * The Auto Complete Term
 * @author amcowiti
 *
 */
public interface AutosuggestTerm {
	public String getIdentifier();
	public String getSynonymTerm();
	public String getOfficialSymbol();
    public String getType();
}
