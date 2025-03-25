package pe.com.microjoin.luz.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "calculo")
public class Calculo {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Long numeroRecibo;

    private String mesFacturado;
    private Integer anhoFacturado;
    private BigDecimal lecturaActualReciboGeneral;
    private LocalDate fechaLecturaActualReciboGeneral;
    private BigDecimal cargoFijo;
    private BigDecimal mantRepCon;
    private BigDecimal consEnerPrecUnit;
    private BigDecimal alumPubl;
    private BigDecimal inteComp;
    private BigDecimal notaDebi;
    private BigDecimal igv;
    private BigDecimal elecRura;
    private BigDecimal inteMora;
    private LocalDate fechLectActuClinVete;
    private BigDecimal lectActuClinVete;
    private LocalDate fechLectActuClinOdon;
    private BigDecimal lectActuClinOdon;
    private BigDecimal subtClinOdon;
    private BigDecimal subtClinVete;
    private BigDecimal subtProp;
    private BigDecimal subtReciGene;

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
}
