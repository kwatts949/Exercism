class Complement
  def self.of_dna(base)
    p base
    if base == 'C'
      'G'
    elsif base == 'G'
      'C'
    elsif base == 'T'
      'A'
    elsif base == 'A'
      'U'
    else
      ''
    end
  end
end