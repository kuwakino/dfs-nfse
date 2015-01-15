//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.15 at 10:12:45 AM BRST 
//


package br.com.dsfnet.nfse.wsnfe2.lote.retornoConsultaLote;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import br.com.dsfnet.nfse.wsnfe2.tp.TpListaAlertas;
import br.com.dsfnet.nfse.wsnfe2.tp.TpListaErros;
import br.com.dsfnet.nfse.wsnfe2.tp.TpListaNFSe;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecalho">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodCidade" type="{http://localhost:8080/WsNFe2/tp}tpCodCidade"/>
 *                   &lt;element name="Sucesso" type="{http://localhost:8080/WsNFe2/tp}tpSucesso"/>
 *                   &lt;element name="NumeroLote" type="{http://localhost:8080/WsNFe2/tp}tpNumero"/>
 *                   &lt;element name="CPFCNPJRemetente" type="{http://localhost:8080/WsNFe2/tp}tpCPFCNPJ"/>
 *                   &lt;element name="RazaoSocialRemetente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DataEnvioLote" type="{http://localhost:8080/WsNFe2/tp}tpDataHoraNulo"/>
 *                   &lt;element name="QtdNotasProcessadas" type="{http://localhost:8080/WsNFe2/tp}tpQtdRpsLote"/>
 *                   &lt;element name="TempoProcessamento" type="{http://localhost:8080/WsNFe2/tp}tpTempoProcessamento"/>
 *                   &lt;element name="ValorTotalServicos" type="{http://localhost:8080/WsNFe2/tp}tpValor"/>
 *                   &lt;element name="ValorTotalDeducoes" type="{http://localhost:8080/WsNFe2/tp}tpValor"/>
 *                   &lt;element name="Versao" type="{http://localhost:8080/WsNFe2/tp}tpVersao"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Alertas" type="{http://localhost:8080/WsNFe2/tp}tpListaAlertas" minOccurs="0"/>
 *         &lt;element name="Erros" type="{http://localhost:8080/WsNFe2/tp}tpListaErros" minOccurs="0"/>
 *         &lt;element name="ListaNFSe" type="{http://localhost:8080/WsNFe2/tp}tpListaNFSe" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabecalho",
    "alertas",
    "erros",
    "listaNFSe"
})
@XmlRootElement(name = "RetornoConsultaLote")
public class RetornoConsultaLote {

    @XmlElement(name = "Cabecalho", required = true)
    protected RetornoConsultaLote.Cabecalho cabecalho;
    @XmlElement(name = "Alertas")
    protected TpListaAlertas alertas;
    @XmlElement(name = "Erros")
    protected TpListaErros erros;
    @XmlElement(name = "ListaNFSe")
    protected TpListaNFSe listaNFSe;

    /**
     * Gets the value of the cabecalho property.
     * 
     * @return
     *     possible object is
     *     {@link RetornoConsultaLote.Cabecalho }
     *     
     */
    public RetornoConsultaLote.Cabecalho getCabecalho() {
        return cabecalho;
    }

    /**
     * Sets the value of the cabecalho property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetornoConsultaLote.Cabecalho }
     *     
     */
    public void setCabecalho(RetornoConsultaLote.Cabecalho value) {
        this.cabecalho = value;
    }

    /**
     * Gets the value of the alertas property.
     * 
     * @return
     *     possible object is
     *     {@link TpListaAlertas }
     *     
     */
    public TpListaAlertas getAlertas() {
        return alertas;
    }

    /**
     * Sets the value of the alertas property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpListaAlertas }
     *     
     */
    public void setAlertas(TpListaAlertas value) {
        this.alertas = value;
    }

    /**
     * Gets the value of the erros property.
     * 
     * @return
     *     possible object is
     *     {@link TpListaErros }
     *     
     */
    public TpListaErros getErros() {
        return erros;
    }

    /**
     * Sets the value of the erros property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpListaErros }
     *     
     */
    public void setErros(TpListaErros value) {
        this.erros = value;
    }

    /**
     * Gets the value of the listaNFSe property.
     * 
     * @return
     *     possible object is
     *     {@link TpListaNFSe }
     *     
     */
    public TpListaNFSe getListaNFSe() {
        return listaNFSe;
    }

    /**
     * Sets the value of the listaNFSe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpListaNFSe }
     *     
     */
    public void setListaNFSe(TpListaNFSe value) {
        this.listaNFSe = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CodCidade" type="{http://localhost:8080/WsNFe2/tp}tpCodCidade"/>
     *         &lt;element name="Sucesso" type="{http://localhost:8080/WsNFe2/tp}tpSucesso"/>
     *         &lt;element name="NumeroLote" type="{http://localhost:8080/WsNFe2/tp}tpNumero"/>
     *         &lt;element name="CPFCNPJRemetente" type="{http://localhost:8080/WsNFe2/tp}tpCPFCNPJ"/>
     *         &lt;element name="RazaoSocialRemetente" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DataEnvioLote" type="{http://localhost:8080/WsNFe2/tp}tpDataHoraNulo"/>
     *         &lt;element name="QtdNotasProcessadas" type="{http://localhost:8080/WsNFe2/tp}tpQtdRpsLote"/>
     *         &lt;element name="TempoProcessamento" type="{http://localhost:8080/WsNFe2/tp}tpTempoProcessamento"/>
     *         &lt;element name="ValorTotalServicos" type="{http://localhost:8080/WsNFe2/tp}tpValor"/>
     *         &lt;element name="ValorTotalDeducoes" type="{http://localhost:8080/WsNFe2/tp}tpValor"/>
     *         &lt;element name="Versao" type="{http://localhost:8080/WsNFe2/tp}tpVersao"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codCidade",
        "sucesso",
        "numeroLote",
        "cpfcnpjRemetente",
        "razaoSocialRemetente",
        "dataEnvioLote",
        "qtdNotasProcessadas",
        "tempoProcessamento",
        "valorTotalServicos",
        "valorTotalDeducoes",
        "versao"
    })
    public static class Cabecalho {

        @XmlElement(name = "CodCidade")
        protected long codCidade;
        @XmlElement(name = "Sucesso")
        protected boolean sucesso;
        @XmlElement(name = "NumeroLote")
        protected int numeroLote;
        @XmlElement(name = "CPFCNPJRemetente", required = true)
        protected String cpfcnpjRemetente;
        @XmlElement(name = "RazaoSocialRemetente", required = true)
        protected String razaoSocialRemetente;
        @XmlElement(name = "DataEnvioLote", required = true)
        protected String dataEnvioLote;
        @XmlElement(name = "QtdNotasProcessadas")
        protected int qtdNotasProcessadas;
        @XmlElement(name = "TempoProcessamento")
        protected long tempoProcessamento;
        @XmlElement(name = "ValorTotalServicos", required = true)
        protected BigDecimal valorTotalServicos;
        @XmlElement(name = "ValorTotalDeducoes", required = true)
        protected BigDecimal valorTotalDeducoes;
        @XmlElement(name = "Versao")
        protected long versao;

        /**
         * Gets the value of the codCidade property.
         * 
         */
        public long getCodCidade() {
            return codCidade;
        }

        /**
         * Sets the value of the codCidade property.
         * 
         */
        public void setCodCidade(long value) {
            this.codCidade = value;
        }

        /**
         * Gets the value of the sucesso property.
         * 
         */
        public boolean isSucesso() {
            return sucesso;
        }

        /**
         * Sets the value of the sucesso property.
         * 
         */
        public void setSucesso(boolean value) {
            this.sucesso = value;
        }

        /**
         * Gets the value of the numeroLote property.
         * 
         */
        public int getNumeroLote() {
            return numeroLote;
        }

        /**
         * Sets the value of the numeroLote property.
         * 
         */
        public void setNumeroLote(int value) {
            this.numeroLote = value;
        }

        /**
         * Gets the value of the cpfcnpjRemetente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPFCNPJRemetente() {
            return cpfcnpjRemetente;
        }

        /**
         * Sets the value of the cpfcnpjRemetente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPFCNPJRemetente(String value) {
            this.cpfcnpjRemetente = value;
        }

        /**
         * Gets the value of the razaoSocialRemetente property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRazaoSocialRemetente() {
            return razaoSocialRemetente;
        }

        /**
         * Sets the value of the razaoSocialRemetente property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRazaoSocialRemetente(String value) {
            this.razaoSocialRemetente = value;
        }

        /**
         * Gets the value of the dataEnvioLote property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDataEnvioLote() {
            return dataEnvioLote;
        }

        /**
         * Sets the value of the dataEnvioLote property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDataEnvioLote(String value) {
            this.dataEnvioLote = value;
        }

        /**
         * Gets the value of the qtdNotasProcessadas property.
         * 
         */
        public int getQtdNotasProcessadas() {
            return qtdNotasProcessadas;
        }

        /**
         * Sets the value of the qtdNotasProcessadas property.
         * 
         */
        public void setQtdNotasProcessadas(int value) {
            this.qtdNotasProcessadas = value;
        }

        /**
         * Gets the value of the tempoProcessamento property.
         * 
         */
        public long getTempoProcessamento() {
            return tempoProcessamento;
        }

        /**
         * Sets the value of the tempoProcessamento property.
         * 
         */
        public void setTempoProcessamento(long value) {
            this.tempoProcessamento = value;
        }

        /**
         * Gets the value of the valorTotalServicos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotalServicos() {
            return valorTotalServicos;
        }

        /**
         * Sets the value of the valorTotalServicos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotalServicos(BigDecimal value) {
            this.valorTotalServicos = value;
        }

        /**
         * Gets the value of the valorTotalDeducoes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotalDeducoes() {
            return valorTotalDeducoes;
        }

        /**
         * Sets the value of the valorTotalDeducoes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotalDeducoes(BigDecimal value) {
            this.valorTotalDeducoes = value;
        }

        /**
         * Gets the value of the versao property.
         * 
         */
        public long getVersao() {
            return versao;
        }

        /**
         * Sets the value of the versao property.
         * 
         */
        public void setVersao(long value) {
            this.versao = value;
        }

    }

}
