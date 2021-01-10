package clicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ClickerView extends JFrame {
    private JPanel buttonPanel;
    private JButton kidsButton;
    private JLabel appleLabel;
    private JPanel mainPanel;
    private JLabel infoLabel;
    private JButton farmerButton;
    private JLabel perSecLabel;
    private JLabel kidPriceLabel;
    private JLabel farmerPriceLabel;
    private JButton grandmaButton;
    private JLabel grandmaPriceLabel;
    private JButton grandpaButton;
    private JLabel grandpaPriceLabel;
    private JButton tractorButton;
    private JLabel tractorPriceLabel;
    private JButton factoryButton;
    private JLabel factoryPriceLabel;

    private ClickerPresenter presenter;

    public ClickerView() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        setVisible(true);

        kidsButton.addActionListener(e -> presenter.kidBought());
        farmerButton.addActionListener(e -> presenter.farmerBought());
        grandmaButton.addActionListener(e -> presenter.grandmaBought());
        grandpaButton.addActionListener(e -> presenter.grandpaBought());
        tractorButton.addActionListener(e -> presenter.tractorBought());
        factoryButton.addActionListener(e -> presenter.factoryBought());
    }

    public void setPresenter(ClickerPresenter presenter) {
        this.presenter = presenter;
    }

    public void setAppleLabel(String text) {
        appleLabel.setText(text);
    }

    public void setPerSecLabel(String text) {
        perSecLabel.setText(text);
    }

    public void setKidPriceLabel(String text) {
        kidPriceLabel.setText(text);
    }

    public void setFarmerPriceLabel(String text) {
        farmerPriceLabel.setText(text);
    }

    public void setGrandmaPriceLabel(String text) {
        grandmaPriceLabel.setText(text);
    }

    public void setGrandpaPriceLabel(String text) {
        grandpaPriceLabel.setText(text);
    }

    public void setTractorPriceLabel(String text) {
        tractorPriceLabel.setText(text);
    }

    public void setFactoryPriceLabel(String text){
        factoryPriceLabel.setText(text);
    }
}