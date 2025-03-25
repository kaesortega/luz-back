package pe.com.microjoin.luz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.microjoin.luz.dto.CalculoDto;
import pe.com.microjoin.luz.model.Calculo;
import pe.com.microjoin.luz.repository.CalculoRepository;

import java.util.List;

@Service
public class CalculoService {

    @Autowired
    private CalculoRepository calculoRepository;

    @Transactional
    public Calculo saveCalculo(CalculoDto dto) {
        Calculo calculo = new Calculo();
        calculo.setNumeroRecibo(dto.numeroRecibo);
        calculo.setMesFacturado(dto.mesFacturado);
        calculo.setAnhoFacturado(dto.anhoFacturado);
        calculo.setLecturaActualReciboGeneral(dto.lecturaActualReciboGeneral);
        calculo.setFechaLecturaActualReciboGeneral(dto.fechaLecturaActualReciboGeneral);
        calculo.setCargoFijo(dto.cargoFijo);
        calculo.setMantRepCon(dto.mantRepCon);
        calculo.setConsEnerPrecUnit(dto.consEnerPrecUnit);
        calculo.setAlumPubl(dto.alumPubl);
        calculo.setInteComp(dto.inteComp);
        calculo.setNotaDebi(dto.notaDebi);
        calculo.setIgv(dto.igv);
        calculo.setElecRura(dto.elecRura);
        calculo.setInteMora(dto.inteMora);
        calculo.setFechLectActuClinVete(dto.fechLectActuClinVete);
        calculo.setLectActuClinVete(dto.lectActuClinVete);
        calculo.setFechLectActuClinOdon(dto.fechLectActuClinOdon);
        calculo.setLectActuClinOdon(dto.lectActuClinOdon);
        calculo.setSubtClinOdon(dto.subtClinOdon);
        calculo.setSubtClinVete(dto.subtClinVete);
        calculo.setSubtProp(dto.subtProp);
        calculo.setSubtReciGene(dto.subtReciGene);

        return calculoRepository.save(calculo);
    }

    public List<Calculo> findAll() {
        return calculoRepository.findAll();
    }

    public Calculo findById(Long id) {
        return calculoRepository.findById(id).orElse(null);
    }
}