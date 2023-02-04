class Complement
  def self.of_dna(base)
    p base
    if base == 'C'
      'G'
    elsif base == 'G'
      'C'
    elsif base == 'T'
      'A'
    else
      ''
    end
  end
end