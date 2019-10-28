/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airport_p3.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Kevin Flores
 */
@Entity
@Table(name = "reserva")
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r")})
public class Reserva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idReserva")
    private Integer idReserva;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reserva")
    private List<Tiquete> tiqueteList;
    @JoinColumn(name = "usuario", referencedColumnName = "id Usuario")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "fechaVuelo", referencedColumnName = "idFechaVuelo")
    @ManyToOne(optional = false)
    private Fechavuelo fechavuelo;
    @JoinColumn(name = "formaPago", referencedColumnName = "idFormaPago")
    @ManyToOne(optional = false)
    private Formapago formapago;

    public Reserva() {
        tiqueteList = null;
    }
    
    public Reserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public Reserva(Usuario usuario, Fechavuelo fechavuelo, Formapago formapago) {
        this.usuario = usuario;
        this.fechavuelo = fechavuelo;
        this.formapago = formapago;
    }

    public Integer getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }

    public List<Tiquete> getTiqueteList() {
        return tiqueteList;
    }

    public void setTiqueteList(List<Tiquete> tiqueteList) {
        this.tiqueteList = tiqueteList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Fechavuelo getFechavuelo() {
        return fechavuelo;
    }

    public void setFechavuelo(Fechavuelo fechavuelo) {
        this.fechavuelo = fechavuelo;
    }

    public Formapago getFormapago() {
        return formapago;
    }

    public void setFormapago(Formapago formapago) {
        this.formapago = formapago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "logica.Reserva[ idReserva=" + idReserva + " ]";
    }
    
}
