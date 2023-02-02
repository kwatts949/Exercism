class SimpleCalculator
  ALLOWED_OPERATIONS = ['+', '/', '*'].freeze

  def self.calculate(first_operand, second_operand, operation)
    raise(ArgumentError) if first_operand.is_a?(String) || second_operand.is_a?(String)
    raise UnsupportedOperation unless ALLOWED_OPERATIONS.include?(operation)

    begin
    result = first_operand.send(operation.to_sym, second_operand)
    "#{first_operand} #{operation} #{second_operand} = #{result}"
    rescue
      "Division by zero is not allowed."
    end
  end

  class UnsupportedOperation < StandardError
  end
end
