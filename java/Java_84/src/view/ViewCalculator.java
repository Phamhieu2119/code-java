package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Calculatorlistener;
import model.ColculatorModel;

public class ViewCalculator extends JFrame {
	private ColculatorModel colculatorModel;
	private JTextField firstValue_jTextField;
	private JTextField secondValue_jTextField;
	private JTextField answer_jTextField;

	private JLabel firstValue_jlabel;
	private JLabel secondValue_jlabel;
	private JLabel anwser_jlabel;

	private JButton jbutton_cong;
	private JButton jbutton_tru;
	private JButton jbutton_nhan;
	private JButton jbutton_chia;
	private JButton jbutton_chiadu;
	private JButton jbutton_pow;

	public ViewCalculator() {
		this.colculatorModel = new ColculatorModel();
		this.init();
	}

	private void init() {
		this.setTitle("Calculator");
		this.setSize(600, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Times new roman", Font.BOLD, 20);

		Calculatorlistener ac = new Calculatorlistener(this);
		
		firstValue_jlabel = new JLabel("1st Value :");
		firstValue_jlabel.setFont(font);
		
		
		secondValue_jlabel = new JLabel("2st Value :");
		secondValue_jlabel.setFont(font);

		anwser_jlabel = new JLabel("Answer :");
		anwser_jlabel.setFont(font);

		firstValue_jTextField = new JTextField(50);
		firstValue_jTextField.setFont(font);

		secondValue_jTextField = new JTextField(50);
		secondValue_jTextField.setFont(font);

		answer_jTextField = new JTextField(50);
		answer_jTextField.setFont(font);

		JPanel jpanel_center = new JPanel();
		jpanel_center.setLayout(new GridLayout(3, 2, 10, 10));
		jpanel_center.add(firstValue_jlabel);
		jpanel_center.add(firstValue_jTextField);
		jpanel_center.add(secondValue_jlabel);
		jpanel_center.add(secondValue_jTextField);
		jpanel_center.add(anwser_jlabel);
		jpanel_center.add(answer_jTextField);

		jbutton_cong = new JButton("+");
		jbutton_cong.setFont(font);
		jbutton_cong.addActionListener(ac);
		
		jbutton_tru = new JButton("-");
		jbutton_tru.setFont(font);
		jbutton_tru.addActionListener(ac);

		jbutton_nhan = new JButton("*");
		jbutton_nhan.setFont(font);
		jbutton_nhan.addActionListener(ac);

		jbutton_chia = new JButton("/");
		jbutton_chia.setFont(font);
		jbutton_chia.addActionListener(ac);

		jbutton_chiadu = new JButton("%");
		jbutton_chiadu.setFont(font);
		jbutton_chiadu.addActionListener(ac);

		jbutton_pow = new JButton("^");
		jbutton_pow.setFont(font);
		jbutton_pow.addActionListener(ac);

		JPanel jpanel_footer = new JPanel();
		jpanel_footer.setLayout(new GridLayout(2, 3, 10, 10));

		jpanel_footer.add(jbutton_cong);
		jpanel_footer.add(jbutton_tru);
		jpanel_footer.add(jbutton_nhan);
		jpanel_footer.add(jbutton_chia);
		jpanel_footer.add(jbutton_chiadu);
		jpanel_footer.add(jbutton_pow);

		this.setLayout(new BorderLayout());
		this.add(jpanel_center, BorderLayout.CENTER);
		this.add(jpanel_footer, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void cong() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.cong();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	public void nhan() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.nhan();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	public void chia() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.chia();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	public void chiadu() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.chiadu();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	public void tru() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.tru();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	public void pow() {
		double first = Double.valueOf(firstValue_jTextField.getText());
		double second = Double.valueOf(secondValue_jTextField.getText());
		this.colculatorModel.setFirstvalue(first);
		this.colculatorModel.setSecondvalue(second);
		this.colculatorModel.pow();
		this.answer_jTextField.setText(this.colculatorModel.getAnswer()+"");
	}
	
}
