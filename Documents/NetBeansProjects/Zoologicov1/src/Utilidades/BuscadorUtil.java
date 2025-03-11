package Utilidades;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.RowFilter;
import javax.swing.JTable;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class BuscadorUtil {
    
    public static void aplicarBusquedaEnTabla(JTextField campoBusqueda, JTable tabla) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) tabla.getModel());
        tabla.setRowSorter(sorter);
        
        campoBusqueda.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                buscar();
            }
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                buscar();
            }
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                buscar();
            }
            
            private void buscar() {
                String texto = campoBusqueda.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    // Buscar en todas las columnas
                    List<RowFilter<Object, Object>> filtros = new ArrayList<>();
                    for (int i = 0; i < tabla.getColumnCount(); i++) {
                        filtros.add(RowFilter.regexFilter("(?i)" + texto, i));
                    }
                    sorter.setRowFilter(RowFilter.orFilter(filtros));
                }
            }
        });
    }
    
    public static void aplicarFiltroPorTipo(String tipo, JTable tabla) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) tabla.getModel());
        tabla.setRowSorter(sorter);
        
        if (tipo.equals("Todos")) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("^" + tipo + "$", 0)); // La columna 0 es "Tipo"
        }
    }
    
    public static void configurarOrdenamientoAvanzado(JTable tabla) {
        tabla.setAutoCreateRowSorter(true);
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>((DefaultTableModel) tabla.getModel());
        tabla.setRowSorter(sorter);
        
        // Configurar comparadores personalizados para diferentes tipos de datos
        sorter.setComparator(2, new Comparator<String>() { // Columna de edad
            @Override
            public int compare(String s1, String s2) {
                try {
                    return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
                } catch (NumberFormatException e) {
                    return s1.compareTo(s2);
                }
            }
        });
    }
}

