

import java.util.Scanner;

public class InstructionSet_Broken {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opCode = input.nextLine();
        
        while (!opCode.equals("END")) {
            String[] codeArgs = opCode.split(" ");

            long result = 0;
            switch (codeArgs[0]) {
                case "INC": {
                	long operandOne = Long.parseLong(codeArgs[1]);
                    result = ++operandOne; 
                    break;
                }
                case "DEC": {
                    long operandOne = Integer.parseInt(codeArgs[1]);
                    result = (long)operandOne -1;
                    break;
                }
                case "ADD": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)operandOne + operandTwo;
                    break;
                }
                case "MLA": {
                    int operandOne  = Integer.parseInt(codeArgs[1]);
                    int operandTwo = Integer.parseInt(codeArgs[2]);
                    result = (long)operandOne * operandTwo;
                    break;
                }
                default:
                    break;
            }
            opCode= input.nextLine();
            System.out.println(result);
        }
    }
}

