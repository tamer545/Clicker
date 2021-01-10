package clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerView extends JFrame {
    private JButton kidsButton;
    private JLabel appleLabel;
    private JPanel mainPanel;
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
    private JButton applesButton;
    private JButton lohnButton;
    private JLabel lohnPriceLabel;
    private JButton herblingenButton;
    private JLabel herblingenPriceLabel;
    private JButton doubleClickButton;
    private JButton quintupleClickButton;
    private JButton hundredTimesClickButton;
    private JLabel doubleClickPriceLabel;
    private JLabel quintubleClickPriceLabel;
    private JLabel hundredTimesClickPriceLabel;
    private JButton bankButton;
    private JButton mineButton;
    private JButton templeButton;
    private JButton magicButton;
    private JButton shipmentButton;
    private JButton cargoButton;
    private JButton labButton;
    private JButton portalButton;

    private ClickerPresenter presenter;

    public ClickerView() {
        setContentPane(mainPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000, 600);
        setVisible(true);

        Image appleButtonIcon = new ImageIcon("apple-icon.png").getImage();
        applesButton.setIcon(new ImageIcon(appleButtonIcon));
        applesButton.setBorderPainted(false);
        applesButton.setContentAreaFilled(false);
        applesButton.setFocusPainted(false);

        applesButton.addActionListener(e -> presenter.addApple());

        //workers
        kidsButton.addActionListener(e -> presenter.kidBought());
        farmerButton.addActionListener(e -> presenter.farmerBought());
        grandmaButton.addActionListener(e -> presenter.grandmaBought());
        grandpaButton.addActionListener(e -> presenter.grandpaBought());
        tractorButton.addActionListener(e -> presenter.tractorBought());
        factoryButton.addActionListener(e -> presenter.factoryBought());
        lohnButton.addActionListener(e -> presenter.lohnBought());
        herblingenButton.addActionListener(e -> presenter.herblingenBought());

        //upgrades
        doubleClickButton.addActionListener(e -> presenter.doubleClickBought());
        quintupleClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.quintubleClickBought();
            }
        });
        hundredTimesClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.hundredTimesClickBought();
            }
        });
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

    public void setFactoryPriceLabel(String text) {
        factoryPriceLabel.setText(text);
    }

    public void setLohnPriceLabel(String text) {
        lohnPriceLabel.setText(text);
    }

    public void setHerblingenPriceLabel(String text) {
        herblingenPriceLabel.setText(text);
    }

    //Upgrades
    public void setDoubleClickPriceLabel(String text) {
        doubleClickPriceLabel.setText(text);
    }

    public JButton getDoubleClickButton() {
        return doubleClickButton;
    }

    public void setQuintubleClickPriceLabel(String text) {
        quintubleClickPriceLabel.setText(text);
    }

    public JButton getQuintupleClickButton() {
        return quintupleClickButton;
    }

    public void setHundredTimesClickPriceLabel(String text) {
        hundredTimesClickPriceLabel.setText(text);
    }

    public JButton getHundredTimesClickButton() {
        return hundredTimesClickButton;
    }
}
