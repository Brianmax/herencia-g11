package companyManagement;

import accountManagement.Usuario;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.StringReader;
import java.util.ArrayList;

public class Company {
    private String nombre;
    private String ruc;
    private ArrayList<Usuario> usuarios;
}
