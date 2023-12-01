import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mahasiswa extends JFrame {
    private JPanel panelMain;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextArea textAreaNama;
    private JTextArea textAreaTL;
    private JTextArea textAreaAlamat;
    private JTextArea Usia;
    private JButton button1;
    private JTextArea taAlamat;

    public mahasiswa() {
        this.setContentPane(panelMain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                String tlTanggal = (String) comboBox1.getSelectedItem();
                String tlBulan = (String) comboBox2.getSelectedItem();
                String tlTahun = (String) comboBox3.getSelectedItem();
                String alamat = taAlamat.getText();

                textAreaNama.setText("Nama :" + " " + nama);
                textAreaTL.setText("Tanggal Lahir :" + " " + tlTanggal + " " + tlBulan + " " + tlTahun);
                textAreaAlamat.setText("Alamat :" + " " + alamat);
                Usia.setText("Usia :" + " ");
            }
        });
    }
    public static void main(String[] args) {
        mahasiswa mahasiswa= new mahasiswa();
        mahasiswa.setVisible(true);
    }
}