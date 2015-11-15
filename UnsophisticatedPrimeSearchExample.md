**primes.omtt**:
```
%% module samples.primes
%% use std.math
%% use html as html

// finds prime numbers from 2 to n (n >= 3)
% def primes n:
  def is_prime k:
    // underscore ( _ ) refers to object in context
    empty (2..(k | sqrt | round) where k mod _ == 0)
  in:
    (2, 3, 5..n where is_prime _)
% end

// Simple template that listes primes from 950 to n on a HTML page.
% def list_primes n
  % def from = 950
  % and title
    Primes from {from} to {n}
  % in
  <html>
    <head><title>{title}</title></head>
    <body>
      <h2>{title}</h2>
      {	primes n
        where _ > from 
        apply html::list
      }
    </body>
  </html>
  % end
% end
```