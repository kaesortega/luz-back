package pe.com.microjoin.luz.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculoDto {
    public Long numeroRecibo;
    public String mesFacturado;
    public Integer anhoFacturado;
    public BigDecimal lecturaActualReciboGeneral;
    public LocalDate fechaLecturaActualReciboGeneral;
    public BigDecimal cargoFijo;
    public BigDecimal mantRepCon;
    public BigDecimal consEnerPrecUnit;
    public BigDecimal alumPubl;
    public BigDecimal inteComp;
    public BigDecimal notaDebi;
    public BigDecimal igv;
    public BigDecimal elecRura;
    public BigDecimal inteMora;
    public LocalDate fechLectActuClinVete;
    public BigDecimal lectActuClinVete;
    public LocalDate fechLectActuClinOdon;
    public BigDecimal lectActuClinOdon;
    public BigDecimal subtClinOdon;

    public Long getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(Long numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public String getMesFacturado() {
        return mesFacturado;
    }

    public void setMesFacturado(String mesFacturado) {
        this.mesFacturado = mesFacturado;
    }

    public Integer getAnhoFacturado() {
        return anhoFacturado;
    }

    public void setAnhoFacturado(Integer anhoFacturado) {
        this.anhoFacturado = anhoFacturado;
    }

    public BigDecimal getLecturaActualReciboGeneral() {
        return lecturaActualReciboGeneral;
    }

    public void setLecturaActualReciboGeneral(BigDecimal lecturaActualReciboGeneral) {
        this.lecturaActualReciboGeneral = lecturaActualReciboGeneral;
    }

    public LocalDate getFechaLecturaActualReciboGeneral() {
        return fechaLecturaActualReciboGeneral;
    }

    public void setFechaLecturaActualReciboGeneral(LocalDate fechaLecturaActualReciboGeneral) {
        this.fechaLecturaActualReciboGeneral = fechaLecturaActualReciboGeneral;
    }

    public BigDecimal getCargoFijo() {
        return cargoFijo;
    }

    public void setCargoFijo(BigDecimal cargoFijo) {
        this.cargoFijo = cargoFijo;
    }

    public BigDecimal getMantRepCon() {
        return mantRepCon;
    }

    public void setMantRepCon(BigDecimal mantRepCon) {
        this.mantRepCon = mantRepCon;
    }

    public BigDecimal getConsEnerPrecUnit() {
        return consEnerPrecUnit;
    }

    public void setConsEnerPrecUnit(BigDecimal consEnerPrecUnit) {
        this.consEnerPrecUnit = consEnerPrecUnit;
    }

    public BigDecimal getAlumPubl() {
        return alumPubl;
    }

    public void setAlumPubl(BigDecimal alumPubl) {
        this.alumPubl = alumPubl;
    }

    public BigDecimal getInteComp() {
        return inteComp;
    }

    public void setInteComp(BigDecimal inteComp) {
        this.inteComp = inteComp;
    }

    public BigDecimal getNotaDebi() {
        return notaDebi;
    }

    public void setNotaDebi(BigDecimal notaDebi) {
        this.notaDebi = notaDebi;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getElecRura() {
        return elecRura;
    }

    public void setElecRura(BigDecimal elecRura) {
        this.elecRura = elecRura;
    }

    public BigDecimal getInteMora() {
        return inteMora;
    }

    public void setInteMora(BigDecimal inteMora) {
        this.inteMora = inteMora;
    }

    public LocalDate getFechLectActuClinVete() {
        return fechLectActuClinVete;
    }

    public void setFechLectActuClinVete(LocalDate fechLectActuClinVete) {
        this.fechLectActuClinVete = fechLectActuClinVete;
    }

    public BigDecimal getLectActuClinVete() {
        return lectActuClinVete;
    }

    public void setLectActuClinVete(BigDecimal lectActuClinVete) {
        this.lectActuClinVete = lectActuClinVete;
    }

    public LocalDate getFechLectActuClinOdon() {
        return fechLectActuClinOdon;
    }

    public void setFechLectActuClinOdon(LocalDate fechLectActuClinOdon) {
        this.fechLectActuClinOdon = fechLectActuClinOdon;
    }

    public BigDecimal getLectActuClinOdon() {
        return lectActuClinOdon;
    }

    public void setLectActuClinOdon(BigDecimal lectActuClinOdon) {
        this.lectActuClinOdon = lectActuClinOdon;
    }

    public BigDecimal getSubtClinOdon() {
        return subtClinOdon;
    }

    public void setSubtClinOdon(BigDecimal subtClinOdon) {
        this.subtClinOdon = subtClinOdon;
    }

    public BigDecimal getSubtClinVete() {
        return subtClinVete;
    }

    public void setSubtClinVete(BigDecimal subtClinVete) {
        this.subtClinVete = subtClinVete;
    }

    public BigDecimal getSubtProp() {
        return subtProp;
    }

    public void setSubtProp(BigDecimal subtProp) {
        this.subtProp = subtProp;
    }

    public BigDecimal getSubtReciGene() {
        return subtReciGene;
    }

    public void setSubtReciGene(BigDecimal subtReciGene) {
        this.subtReciGene = subtReciGene;
    }

    public BigDecimal subtClinVete;
    public BigDecimal subtProp;
    public BigDecimal subtReciGene;
}
